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
public class Menu {
    int opcion = 0;
    Scanner obj = new Scanner(System.in);
    Arbol arbolCarlos = new Arbol();
    
    
    public void verMenu(){
        
        arbolCarlos.insertar("Carlos", "H");
        arbolCarlos.insertar("Luis", "H");
        arbolCarlos.insertar("Andrés", "H");
        arbolCarlos.insertar("Alicia", "M");
        arbolCarlos.insertar("Jorge", "H");
        arbolCarlos.insertar("María", "M");
        arbolCarlos.insertar("Ana", "M");
        
        do{
        System.out.println("Árbol Genealógico de Carlos");
        System.out.println("1. Ver progenitores femeninos");
        System.out.println("2. Ver Inorden, Preordern y Postorden");
        System.out.println("3. Agregar familiar al árbol");
        System.out.println("4. Salir");
        System.out.println("Ingrese una opción: ");
        opcion = obj.nextInt();
        
        switch (opcion){
            case 1:
               arbolCarlos.Progenitores();
               System.out.println("*****Progenitores femeninos*****");
                break;
            case 2:
                System.out.println("\n*****Inorden*****");
                arbolCarlos.inorden();
                System.out.println("\n*****Postorden*****");
                arbolCarlos.postorden();
                System.out.println("\n*****Preorden*****");
                arbolCarlos.preorden();
                break;
            case 3:
                arbolCarlos.insertarFamiliar();
                break;
            case 4:
                System.exit(0);
                break;
                
        }
        }while(opcion != 4);  
    }
}
