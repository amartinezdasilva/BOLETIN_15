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
public class Maxasista extends Metodos{
   private int anosExperiencia;
    private String titulacion;

    public Maxasista() {
        super();
    }
    public Maxasista(int id, int edade, String nome, String apelido,int anosExperiencia, String titulacion) {
        super(id,edade,nome,apelido);
        this.anosExperiencia = anosExperiencia;
        this.titulacion = titulacion;
    }
    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    public String getTitulacion() {
        return titulacion;
    }
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    public void darMasaxes(){    
    }
    @Override
    public  void viaxar(){
         System.out.println("Viaxan os xogadores");
    }

    
}
