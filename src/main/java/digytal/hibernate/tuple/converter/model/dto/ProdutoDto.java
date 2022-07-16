package digytal.hibernate.tuple.converter.model.dto;

import javax.persistence.Column;

public class ProdutoDto {
    private Integer id;
    private String nome;
    private MarcaDto marca = new MarcaDto();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public MarcaDto getMarca() {
        return marca;
    }

    public void setMarca(MarcaDto marca) {
        this.marca = marca;
    }
}
