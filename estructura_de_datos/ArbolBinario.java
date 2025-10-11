import java.util.Arrays; // importamos la clase Scanner para leer por teclado lo del usuario
import java.util.Scanner;  //importamos la clase Arrays para trabajar con arreglos


public class ArbolBinario {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); //creamos el objeto Scanner para leer los datos del usuario

        System.out.println("¡Reto rápido! Dime una lista de # y te digo si tu número está o no está");

        System.out.print("¿Cuántos números vas a darme? ");
        int n = entrada.nextInt();  //la cantidad de # va a ser el tamaño del arreglo guardado como n

		//creamos un arreglo de enteros con ese # n posiciones para guardat la lista del usuario
        int[] lista = new int[n]; 
        System.out.println("Perfecto. Escribe los " + n + " números (uno por línea):");
        for (int i = 0; i < n; i++) lista[i] = entrada.nextInt(); //bucle que lee n y lo guarda en lista

        //Imprimimos la lista hecha por el usuario
        System.out.println("Tu lista: " + Arrays.toString(lista));

        // Convertimos esta lista como una estructura de Árbol Binario, empezando con 0 de raíz
        Nodo raiz = construirDesdeLista(lista, 0);

        System.out.print("Ahora dime el número a buscar: "); //pedimos el # a buscar
        int buscado = entrada.nextInt(); //guardamos este #como buscado

        boolean esta = aparece(buscado, raiz); //ejecutamos la busqueda, esta será true si lo encuentra y false en caso que no esté

        //usamos los operadores condicionales ternarios e imprimimos el mensaje con el resultado
        System.out.println(esta
            ? "TRUE. Sí, tu número aparece en la lista."
            : "FALSE. No, tu número no aparece en la lista."); 

        entrada.close();
    }
    
    //declaramos una clase anidada estatica llamada nodo
    static class Nodo {
        int valor; //dato que guarda el nodo
        Nodo izq, der; //referenciamos a los hijos izquierdo y derecho
        Nodo(int dato) //definimos un constructor de la clase nodo que recibe un entero llamado dato
        { this.valor = dato; } //usamos this para distinguir el campo y el parámetro
    }

    // Metodo para convertir la lista en una estructura binaria teniendo en cuenta el orden por niveles
    static Nodo construirDesdeLista(int[] lista, int i) {
        if (i >= lista.length) return null; //si el indice se sale de la lista no hay nodo
        Nodo n = new Nodo(lista[i]); //crea un nodo en posicion i de la lista
        n.izq = construirDesdeLista(lista, 2 * i + 1); //construimos recursivamente el arbol izquierdo
        n.der = construirDesdeLista(lista, 2 * i + 2); //construimos recursivamente el arbol derecho
        return n; //devuelve el arbol o subarbol construido
    }

    // metodo para buscar el # dentro del arbol
    static boolean aparece(int numero, Nodo raiz) {
        if (raiz == null) return false; //false si no está o es null
        if (raiz.valor == numero) return true; //si el valor del nodo actual coincide será true
        return aparece(numero, raiz.izq) || aparece(numero, raiz.der); //busca recursivamente en el arbol izquiero y si no busca en el derecho
    }
}
