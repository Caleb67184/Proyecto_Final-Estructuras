/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoarból_caleb;

/**
 *
 * @author Caleb
 */
public class Nodo {
    
    private String dato;
    private String genero;
    private Nodo izquierda, derecha;

    public Nodo(String dato, String genero) {
        this.dato = dato;
        this.genero = genero;
        this.izquierda = this.derecha = null;
    }


    public String getDato() {
        return dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.println(this.getDato() + " " + this.getGenero());
    }

    public String getGenero() {
        return genero;
    }

    public void imprimirGenero(){
        System.out.println(this.getGenero());
    }
}
