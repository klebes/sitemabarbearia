/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author KDS
 */
public class Servico {
    private int id;
    private String descicao;
    private Double valor;
    //getters e setters
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    //construtor
    
    public Servico(int id, String descricao, Double valor){
        this.id = id;
        this.descicao = descricao;
        this.valor = valor;
    }
    
}
