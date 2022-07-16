package digytal.hibernate.tuple.converter.entity;

import javax.persistence.*;

@Entity
@Table(name = "tab_produto")
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 80,nullable = false)
    private String nome;

    @Column(name = "marca_id", length = 8)
    private Integer marca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }


}
