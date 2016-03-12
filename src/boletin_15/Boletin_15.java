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
public class Boletin_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Metodos equipo=new Metodos();
        Xogador x=new Xogador();
        Maxasista m=new Maxasista();
        Adestrador a=new Adestrador();
        equipo.concentrarse();
        x.concentrarse();
        m.concentrarse();
        a.concentrarse();
        System.out.println("Fin de metodo concentrarse");
        equipo.viaxar();
        x.viaxar();
        m.viaxar();
        a.viaxar();
        
    }
    
}