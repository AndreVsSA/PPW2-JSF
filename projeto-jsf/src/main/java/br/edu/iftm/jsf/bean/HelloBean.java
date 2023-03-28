/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.jsf.bean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
@Named
@SessionScoped
public class HelloBean implements Serializable{
    private String hello="Hello classe bean";
    private String nome;
    public String gethello(){
        return hello;
    }
    public void dizerOla(){
        FacesMessage fm =new FacesMessage("Olá"+nome);
        FacesContext.getCurrentInstance().addMessage(null, fm);
    }
    public String getnome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    
}
