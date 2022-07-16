package digytal.hibernate.tuple.converter.controller;

import digytal.hibernate.tuple.converter.model.Marca;
import digytal.hibernate.tuple.converter.model.Produto;
import digytal.hibernate.tuple.converter.service.MarcaService;
import digytal.hibernate.tuple.converter.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService service;
    @PostMapping
    public void save(@RequestBody Produto produto){
        service.save(produto);
    }
}
