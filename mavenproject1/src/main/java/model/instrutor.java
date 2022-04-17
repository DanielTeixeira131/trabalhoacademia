/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Daniel C Teixeira
 */
public class instrutor {
    private String telefone;
    private String cpf;
    private String nome;
    private String salario;

    public instrutor(String telefone, String cpf, String nome, String salario) {
        this.telefone = telefone;
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }
public instrutor() {
        this.telefone = null;
        this.cpf = null;
        this.nome = null;
        this.salario = null;
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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    
           
}
