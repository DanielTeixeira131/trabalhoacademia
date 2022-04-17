/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Daniel C Teixeira
 */
public class franquia {
    private String endereco;
    private String numeroderegistro;
    private String numerodealunos;
    private String quantidadedeinstrutores;
    private String caixa;

    public franquia(String endereco, String numeroderegistro, String numerodealunos, String quantidadedeinstrutores, String caixa) {
        this.endereco = endereco;
        this.numeroderegistro = numeroderegistro;
        this.numerodealunos = numerodealunos;
        this.quantidadedeinstrutores = quantidadedeinstrutores;
        this.caixa = caixa;
    }
     public franquia() {
        this.endereco = null;
        this.numeroderegistro = null;
        this.numerodealunos = null;
        this.quantidadedeinstrutores = null;
        this.caixa = null;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroderegistro() {
        return numeroderegistro;
    }

    public void setNumeroderegistro(String numeroderegistro) {
        this.numeroderegistro = numeroderegistro;
    }

    public String getNumerodealunos() {
        return numerodealunos;
    }

    public void setNumerodealunos(String numerodealunos) {
        this.numerodealunos = numerodealunos;
    }

    public String getQuantidadedeinstrutores() {
        return quantidadedeinstrutores;
    }

    public void setQuantidadedeinstrutores(String quantidadedeinstrutores) {
        this.quantidadedeinstrutores = quantidadedeinstrutores;
    }

    public String getCaixa() {
        return caixa;
    }

    public void setCaixa(String caixa) {
        this.caixa = caixa;
    }
    
}
