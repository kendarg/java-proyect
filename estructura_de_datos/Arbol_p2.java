import java.util.*;

class Nodo{
    int valor;
    Nodo izquierdo, derecho;
    
    public Nodo(int valor){
        this.valor = valor;
        izquierdo = derecho = null;
    }
} 

class Arbol{
    Nodo raiz;
    public void insertar(int valor){
        raiz = insertarRec(raiz, valor);
    }
    private Nodo insertarRec(Nodo nodo, int valor){
        if(nodo == null){
            return new Nodo(valor);
        }
        if(valor < nodo.valor){
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        }else{
            nodo.derecho = insertarRec(nodo.derecho, valor);
        }
        return nodo;
    }
    public void inorden(){
        System.out.println("Se va a organisar de forma inorden");
        inordenRec(raiz);
        System.out.println();
    }
    private void inordenRec(Nodo nodo){
        if(nodo != null){
            inordenRec(nodo.izquierdo);
            System.out.println(nodo.valor + " ");
            inordenRec(nodo.derecho);
        }
    }



}

public class Arbol_p2{
    public static void main(String[] args){
        Scanner numeros = new Scanner (System.in);
        Arbol arbol = new Arbol();
        System.out.println("Ingrese el numero '0' para teminar");

        while(true){
            System.out.println("Numero ingresado: ");
            int valor = numeros.nextInt();
            if(valor == 0){
                System.out.println("Terminacion de lista numerica");
                break;
            }
            arbol.insertar(valor);
        }
        arbol.inorden();
    }
}