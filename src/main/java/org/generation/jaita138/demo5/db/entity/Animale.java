package org.generation.jaita138.demo5.db.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Animale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 64)
    private String nome;
    @Column(length = 32)
    private String razza;

    private int peso;
    private int altezza;

    public Long getId() {

        return this.id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getNome() {

        return this.nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getRazza() {

        return this.razza;
    }

    public void setRazza(String razza) {

        this.razza = razza;
    }

    public int getPeso() {

        return this.peso;
    }

    public void setPeso(int peso) {

        this.peso = peso;
    }

    public int getAltezza() {

        return this.altezza;
    }

    public void setAltezza(int altezza) {

        this.altezza = altezza;
    }

    @Override
    public String toString() {

        return "Animale: [\n"
                + "  id: " + this.id + ",\n"
                + "  nome: " + this.nome + ",\n"
                + "  razza: " + this.razza + ",\n"
                + "  peso: " + this.peso + ",\n"
                + "  altezza: " + this.altezza + "\n"
                + "]";
    }
}
