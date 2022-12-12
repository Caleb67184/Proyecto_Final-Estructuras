/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoarból_caleb;


import java.util.Scanner;

/**
 *
 * @author Caleb
 */
public class Arbol {
    
    private Nodo raiz;

    public Arbol() {}
    
    Scanner obj = new Scanner(System.in);
    
    public boolean existe(String busqueda) {
        return existe(this.raiz, busqueda);
    }

    private boolean existe(Nodo n, String busqueda) {
        if (n == null) {
            return false;
        }
        if (n.getDato().equals(busqueda)) {
            return true;
        } else if (busqueda.compareTo(n.getDato()) < 0) {
            return existe(n.getIzquierda(), busqueda);
        } else {
            return existe(n.getDerecha(), busqueda);
        }

    }

    private void Progenitores(Nodo n) {
        if (n != null) {
            Progenitores(n.getDerecha());
            Progenitores(n.getIzquierda());
            if (n.getGenero().equals("M")) {
                n.imprimirDato();
            }
        }
    }

    public void Progenitores() {
        this.Progenitores(this.raiz);
    }

    public void insertar(String dato, String genero) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato, genero);
        } else {
            this.insertar(this.raiz, dato, genero);
        }
    }

    private void insertar(Nodo padre, String dato, String genero) {
        if (dato.compareTo(padre.getDato()) > 0) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Nodo(dato, genero));
            } else {
                this.insertar(padre.getDerecha(), dato, genero);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Nodo(dato, genero));
            } else {
                this.insertar(padre.getIzquierda(), dato, genero);
            }
        }
    }

    public void insertarFamiliar() {
        System.out.println("Ingrese el nombre a agregar: ");
        String nombre = obj.nextLine();
        System.out.println("Ingrese el género a de la persona('M','H'): ");
        String genero = obj.nextLine();
        insertar(nombre, genero);
    }

    private void preorden(Nodo n) {
        if (n != null) {
            n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }
    }

    private void inorden(Nodo n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDato();
            inorden(n.getDerecha());
        }
    }

    private void postorden(Nodo n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDato();
        }
    }

    public void preorden() {
        this.preorden(this.raiz);
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }
    
}
