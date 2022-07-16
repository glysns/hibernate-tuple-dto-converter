package digytal.hibernate.tuple.converter.core;

import org.springframework.beans.PropertyAccessor;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConverterRepository {
    @PersistenceContext
    private EntityManager em;

    public <T> List<T> convert(String sql,Class dto){
        Query query = em.createNativeQuery(sql, Tuple.class);
        List<Tuple> result = query.getResultList();
        List<T> list = convertCollection(result, dto);
        return list;
    }
    private <T> List<T> convertCollection(List<Tuple> result, Class dto) {
        List list = new ArrayList();
        result.forEach(tuple -> {
            list.add(convertElement(tuple, dto));
        });
        return list;

    }
    private <T> T convertElement(Tuple record, Class dto) {
        Object item = null;
        String field=null;
        try {
            item = dto.newInstance();
            for(TupleElement te: record.getElements()){
                field = te.getAlias();
                Object value = record.get(field);
                set(item,field, value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (T) item;
    }
    private void set(Object item,String field, Object value) throws  Exception{
        if(value!=null){
            Class type = value.getClass();
            if (type.equals(Integer.class))
                value= new BigDecimal(value.toString()).intValue();
            else if (type.equals(Long.class))
                value= new BigDecimal(value.toString()).longValue();
            else if (type.equals(LocalDateTime.class))
                value= ((java.sql.Timestamp) value).toLocalDateTime();
            else if (type.equals(java.sql.Date.class))
                value=((java.sql.Date) value).toLocalDate();

            /**
             * Usando o spring, depois ver outras formas como BeansUtils
             * https://stackoverflow.com/questions/10009052/invoking-setter-method-using-java-reflection
             */
            PropertyAccessor myAccessor = PropertyAccessorFactory.forDirectFieldAccess(item);
            myAccessor.setPropertyValue(field, value);
        }
    }
}
