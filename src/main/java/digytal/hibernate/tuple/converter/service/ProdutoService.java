package digytal.hibernate.tuple.converter.service;

import digytal.hibernate.tuple.converter.entity.MarcaEntity;
import digytal.hibernate.tuple.converter.entity.ProdutoEntity;
import digytal.hibernate.tuple.converter.model.Marca;
import digytal.hibernate.tuple.converter.model.Produto;
import digytal.hibernate.tuple.converter.repository.MarcaRepository;
import digytal.hibernate.tuple.converter.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;
    public void save(Produto produto){
        //poderia usar um converter
        ProdutoEntity entity = new ProdutoEntity();
        entity.setNome(produto.getNome());
        entity.setMarca(produto.getMarca());
        repository.save(entity);
    }
}
