package digytal.hibernate.tuple.converter.service;

import digytal.hibernate.tuple.converter.core.ConverterRepository;
import digytal.hibernate.tuple.converter.entity.ProdutoEntity;
import digytal.hibernate.tuple.converter.model.Produto;
import digytal.hibernate.tuple.converter.model.dto.ProdutoDto;
import digytal.hibernate.tuple.converter.repository.ProdutoConverterRepository;
import digytal.hibernate.tuple.converter.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    @Autowired
    private ProdutoConverterRepository converterRepository;
    public void save(Produto produto){
        //poderia usar um converter
        ProdutoEntity entity = new ProdutoEntity();
        entity.setNome(produto.getNome());
        entity.setMarca(produto.getMarca());
        repository.save(entity);
    }
    public List<ProdutoDto> findAllDtos(){
        return  converterRepository.findAll();
    }
}
