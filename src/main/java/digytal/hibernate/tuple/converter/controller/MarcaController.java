package digytal.hibernate.tuple.converter.controller;

import digytal.hibernate.tuple.converter.model.Marca;
import digytal.hibernate.tuple.converter.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("marcas")
public class MarcaController {
    @Autowired
    private MarcaService service;
    @PostMapping
    public void save(@RequestBody Marca marca){
        service.save(marca);
    }
}
