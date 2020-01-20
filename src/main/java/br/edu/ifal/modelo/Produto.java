package br.edu.ifal.modelo;

public class Produto{

 private String nome;
 private String descricao;

 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Produto(String nome) {
        this.nome = nome;
    }

 
}