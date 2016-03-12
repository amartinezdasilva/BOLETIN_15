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
public class Adestrador extends Metodos {
   
    private String idFederacion;
    public Adestrador() {
        super();
    }
    public Adestrador(int id, int edade, String nome, String apelido,String idFederacion) {
        super(id,edade,nome,apelido);
        this.idFederacion = idFederacion;
    }
    public String getIdFederacion() {
        return idFederacion;
    }
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    public void dirixirPartido(){     
    }
    public void dirixirAdestramento(){      
    }
    @Override
    public  void viaxar(){
        System.out.println("Viaxan os xogadores");
    }

    
}