/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author KDS
 */
public class Usuario extends Pessoa{

    private String senha;
    private String nivelacesso;
 
//constructor

    public Usuario(String senha, int id, String nome) {
        super(id, nome);
        this.senha = senha;
    }

    public Usuario(String senha, String nivelacesso, int id, String nome, char sexo, Date dataNscimento, String telefone, String email, String rg) {
        super(id, nome, sexo, dataNscimento, telefone, email, rg);
        this.senha = senha;
        this.nivelacesso = nivelacesso;
    }
    //getters e setters

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelacesso() {
        return nivelacesso;
    }

    public void setNivelacesso(String nivelacesso) {
        this.nivelacesso = nivelacesso;
    }
    
    
}
