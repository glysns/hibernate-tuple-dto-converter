package digytal.hibernate.tuple.converter.repository;

import digytal.hibernate.tuple.converter.core.ConverterRepository;
import digytal.hibernate.tuple.converter.model.dto.ProdutoDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProdutoConverterRepository extends ConverterRepository {
    public List<ProdutoDto> findAll(){
        String sql = "SELECT p.id as \"id\", p.nome as \"nome\", m.id as \"marca.id\", m.nome as \"marca.nome\"" +
                " FROM tab_produto p INNER JOIN tab_marca m ON p.marca_id = m.id ";
        List<ProdutoDto> produtos = convert(sql,ProdutoDto.class);
        return produtos;
    }
}
