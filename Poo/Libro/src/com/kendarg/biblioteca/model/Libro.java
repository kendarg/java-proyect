package com.kendarg.biblioteca.model;


public class Libro{
    private int isbn;
    private String nombre;
    private int numeroPaginas;
    private String autor;
    private boolean prestado;
    private final int valorHoja = 100;

    public Libro(int isbn, String nombre, int numeroPaginas, String autor, boolean prestado){
        this.isbn = isbn;
        this.nombre = nombre;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.prestado = prestado;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    public int calculoImpresion(){
        return numeroPaginas * valorHoja;
    }

    public boolean isPrestado(){
        return prestado;
    }
    public void prestar(){
        prestado = true;
    }
    public void devolver(){
        prestado = false;
    }

    public void info(){
        System.out.println("El libro: " + nombre + " Tiene com ISBN: " + isbn + " Su autor es: " + autor + " Tiene una cantidad de hojas de: " + numeroPaginas + " y su estado es de: " + isPrestado());
    }
}



