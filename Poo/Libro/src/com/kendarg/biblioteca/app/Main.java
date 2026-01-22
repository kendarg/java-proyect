package com.kendarg.biblioteca.app;
import com.kendarg.biblioteca.model.Libro;
;
public class Main {
    public static void main(String[] args){
        Libro l1 = new Libro(0001, "Carta en carta", 50, "Ana Maria Machado", false);
        Libro l2 = new Libro(0002, "Ingles basico", 100, "N/N", true);
        Libro l3 = new Libro(0003, "Cien años de soledad", 1615, "Gabriel García Márquez", true);
        Libro l4 = new Libro(0004, "Don Quijote de la Mancha", 156, "Miguel de Cervantes", false);
        Libro l5 = new Libro(0005, "Harry Potter", 8899, "J.K. Rowling", true);

        l1.prestar();
        l2.calculoImpresion();
        l3.info();
        System.out.println("¿Esta prestado? " + l1.isPrestado());
        l1.devolver();
        System.out.println("¿Esta prestado? " + l1.isPrestado());
        l4.calculoImpresion();
        l5.info();


    }
}

