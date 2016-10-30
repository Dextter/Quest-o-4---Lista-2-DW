/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifrn.tads.dao;

/**
 *
 * @author Dextter
 */
public class Formulario {
    private String enderecoEletronicoR, senhaRemetente, enderecoEletronicoD, assunto, corpo;

    public Formulario() {
    }
 
    public Formulario(String enderecoEletronicoR, String senhaRemetente, String enderecoEletronicoD, String assunto, String corpo) {
        this.enderecoEletronicoR = enderecoEletronicoR;
        this.senhaRemetente = senhaRemetente;
        this.enderecoEletronicoD = enderecoEletronicoD;
        this.assunto = assunto;
        this.corpo = corpo;
    }

    public String getEnderecoEletronicoR() {
        return enderecoEletronicoR;
    }

    public void setEnderecoEletronicoR(String enderecoEletronicoR) {
        this.enderecoEletronicoR = enderecoEletronicoR;
    }

    public String getSenhaRemetente() {
        return senhaRemetente;
    }

    public void setSenhaRemetente(String senhaRemetente) {
        this.senhaRemetente = senhaRemetente;
    }   
    
    public String getEnderecoEletronicoD() {
        return enderecoEletronicoD;
    }

    public void setEnderecoEletronicoD(String enderecoEletronicoD) {
        this.enderecoEletronicoD = enderecoEletronicoD;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }
        
}
