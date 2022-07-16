package digytal.hibernate.tuple.converter.controller;

import digytal.hibernate.tuple.converter.model.Marca;
import digytal.hibernate.tuple.converter.model.Produto;
import digytal.hibernate.tuple.converter.model.dto.ProdutoDto;
import digytal.hibernate.tuple.converter.service.MarcaService;
import digytal.hibernate.tuple.converter.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService service;
    @PostMapping
    public void save(@RequestBody Produto produto){
        service.save(produto);
    }
    @GetMapping
    public List<ProdutoDto> findAllDtos(){
        return  service.findAllDtos();
    }
}
