package com.colecao.jogos.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
@Table(name="jogo")
public class Jogo {
    @Id
    @Column(name="id_jedi")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Size(min = 3, max = 10, message = "Nome deve conter entre 3 e 10 caracteres")
    @NotBlank(message = "Nome não pode estar em branco")
    @Column(name = "nome")
    String nome;

    @Size(min = 2, max = 10, message = "Nome deve conter entre 2 e 10 caracteres")
    @NotBlank(message = "Nome não pode estar em branco")
    @Column(name = "tipo")
    String tipo;

    @Size(min = 3, max = 10, message = "Nome deve conter entre 3 e 10 caracteres")
    @NotBlank(message = "Nome não pode estar em branco")
    @Column(name = "genero")
    String genero;

    public Jogo(){}

    public Jogo(final Long id, final String nome, final String tipo, final String genero){
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
