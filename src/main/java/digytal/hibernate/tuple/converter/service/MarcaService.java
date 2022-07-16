package digytal.hibernate.tuple.converter.service;

import digytal.hibernate.tuple.converter.entity.MarcaEntity;
import digytal.hibernate.tuple.converter.model.Marca;
import digytal.hibernate.tuple.converter.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarcaService {
    @Autowired
    private MarcaRepository repository;
    public void save(Marca marca){
        //poderia usar um converter
        MarcaEntity entity = new MarcaEntity();
        entity.setNome(marca.getNome());
        repository.save(entity);
    }
}
