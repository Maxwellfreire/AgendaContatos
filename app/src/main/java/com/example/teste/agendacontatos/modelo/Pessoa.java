package com.example.teste.agendacontatos.modelo;

import java.io.Serializable;

public class Pessoa implements Serializable{

    //Atributos da minha classe pessoa.

    private int id;
    private String nome;
    private int idade;
    private String endereco;
    private String telefone;

    public Pessoa() {
        //Contrutor da minha classe pessoa.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return "Nome " +nome.toString()+" "+"Telefone: "+telefone.toString();
    }
}
