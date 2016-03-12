/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_15;

/**
 *
 * @author AAron
 */
public class Metodos {
  int id,edade;
    String nome,apelido;

    public Metodos() {
    }

    public Metodos(int id, int edade, String nome, String apelido) {
        this.id = id;
        this.edade = edade;
        this.nome = nome;
        this.apelido = apelido;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getEdade() {
        return edade;
    }
    public void setEdade(int edade) {
        this.edade = edade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }  
     public void concentrarse(){
        System.out.println("Concentrase a seleccion");
    }
    public  void viaxar(){
        System.out.println("Viaxa a seleccion");
    }
    @Override
    public String toString() {
        return "Equipo de Futbol{" + "id=" + id + ", edade=" + edade + ", nome=" + nome + ", apelido=" + apelido + '}';
    }
    
}