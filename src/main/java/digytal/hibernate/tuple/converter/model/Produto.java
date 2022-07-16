package digytal.hibernate.tuple.converter.model;

import javax.persistence.Column;

public class Produto {
    private String nome;
    private Integer marca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMarca() {
        return marca;
    }

    public void setMarca(Integer marca) {
        this.marca = marca;
    }
}
