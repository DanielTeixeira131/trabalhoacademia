/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Daniel C Teixeira
 */
public class aluno {
    private String telefone;
    private String cpf;
    private String nome;
    private String peso;
    private String idade;
    private String genero;
    private String altura;

    public aluno(String telefone, String cpf, String nome, String peso, String idade, String genero, String altura) {
        this.telefone = telefone;
        this.cpf = cpf;
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.genero = genero;
        this.altura = altura;
    }
        public aluno (){
        this.telefone = null;
        this.cpf = null;
        this.nome = null;
        this.peso = null;
        this.idade = null;
        this.genero = null;
        this.altura = null;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
        
}
