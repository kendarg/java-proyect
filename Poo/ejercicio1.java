public class ejercicio1{
    public static void main(String[] args){
        Libros l1 = new Libros(0001, "Carta en carta", 50, "Ana Maria Machado", false);
        Libros l2 = new Libros(0002, "Ingles basico", 100, "N/N", true);
        Libros l3 = new Libros(0003, "Cien años de soledad", 1615, "Gabriel García Márquez", true);
        Libros l4 = new Libros(0004, "Don Quijote de la Mancha", 156, "Miguel de Cervantes", false);
        Libros l5 = new Libros(0005, "Harry Potter", 8899, "J.K. Rowling", true);
    
    l1.info();
    l2.info();
    l3.info();
    l4.info();
    l5.info();
    }
}
class Libros{
//  Realiza una clase que represente a un libro.//  Encapsula todos sus atributos.Un libro se define por:
    //  - ISBN
    private int isbn;
    //  - titulo
    private String titulo;
    //  - numero de paginas
    private int numero_paginas;
    public int getnumero_paginas(){
        return numero_paginas;
    }
    //  - autor
    private String autor;
    //  - prestado
    private boolean prestado;
    private int valor_por_hoja = 100;
    
    public boolean getprestado(){
    return prestado;     
    }    
    Libros(int isbn, String titulo, int numero_paginas, String autor, boolean prestado){
        this.isbn = isbn;
        this.titulo = titulo;
        this.numero_paginas = numero_paginas;
        this.autor = autor;
        this.prestado = prestado;
    }
    void info(){
        System.out.println("Informacion sobre el libro:");
        System.out.println("Numero ISBN: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Numero de paginas: " + numero_paginas);
        System.out.println("Costo por hoja: " + valor_por_hoja);
        //  - imprimir: dado un coste, calcularemos el coste de imprimir todas las
        //  paginas del libro.
        int valor_total =  getnumero_paginas() * valor_por_hoja;
        System.out.println("Costo de impresion: " + valor_total );
        System.out.println("Autor: " + autor);
        // System.out.println("Estado del libro (true/prestar, false/devolver)" + prestado  );
        if(prestado == false){
            System.out.println("El libro esta prestado devolver");
        }else{
            System.out.println("El libro esta en estanteria");
            
        }
        System.out.println("---------------------------------------------------------");
    
    }
}






