/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Edison
 */
public class Juego {

    private String palabra;
    private String pista;
///////contructor\\\\\\\\\\
    public Juego() {
    }

    public Juego(String palabra, String pista) {
        this.palabra = palabra;
        this.pista = pista;
    }
    //////getters
    public String getPalabra() {
        return palabra;
    }
    public String getPista() {
        return pista;
    }

    //////setters

    public void setPalabra(String nombre) {
        this.palabra = nombre;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

}
