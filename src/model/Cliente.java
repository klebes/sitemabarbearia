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
public class Cliente extends Pessoa{

    private String cep;
    private String endereco;
    
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    //getters e setters
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //contrutor
    public Cliente(String cep, String endereco, int id, String nome, char sexo, Date dataNscimento, String telefone, String email, String rg) {
        super(id, nome, sexo, dataNscimento, telefone, email, rg);
        this.cep = cep;
        this.endereco = endereco;
    }

    public Cliente(String cep, String endereco, int id, String nome) {
        super(id, nome);
        this.cep = cep;
        this.endereco = endereco;
    }
    
    
}
