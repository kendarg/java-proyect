// utilizamos la libreria util por completo para facilitar el codigo
import java.util.*;

// creo una clase llamada Nodo para la Clasificaion de los numeros de forma binaria y llamar lugo
class Nodo{
int valor;
Nodo izquierdo, derecho;


public Nodo(int valor){
    this.valor = valor;
    izquierdo = derecho =  null;
}
}
// Creo otra clase la cual va a ser la que va a organizar los numero y la voy a colocar de forma inorden para su mayor facilidad de reconocimiento
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
        System.out.println("Organisacioln de menor a mayor (Inorden): ");
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
        // aca se genera un boolean par buscar en el arbol el numero que se va ingrsar luego
        // es decir que si se coloca al inicio 123 y luegoi en la busqueda se quiere saver 
        // si este esta en la lista este lo buscara y indicara si este esta en esta o no
    public boolean busqueda(int valor){
        return buscar(raiz, valor);
    }
    private boolean buscar(Nodo nodo, int valor){
        if(nodo == null){
            return false;
        }
        if(valor == nodo.valor){
            return true;
        }
        if(valor < nodo.valor){
            return buscar(nodo.izquierdo, valor);
        }else{
            return buscar(nodo.derecho, valor);
        }
    }

}

// llamo al meto junto con las demas clases y asi que el codigo pueda ejecutarce de forma correcta

public class Arbol_p{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Arbol arbol = new Arbol();
        System.out.println("Ingrese los numeros del arbol Binario (para terminar colocar '0')");

        while(true){
            System.out.println("Numero ingresado: ");
            int valor = sc.nextInt();
            if(valor == 0){
                System.out.println("Finalizacion del arbol Binarios");
                break;
            }
            arbol.insertar(valor);
        }
        arbol.inorden();
        while(true){
            System.out.println("Ingresa un numero para identificar si esta en el arbol binario");
            System.out.println("para salor vuelve a ingresar '0': ");
            int dato = sc.nextInt();
            if(dato == 0 ){
                System.out.println("finalisacion del programa.");
            }
            if(arbol.busqueda(dato)){
                System.out.println("El numero ingresado si se encuentra en el arbol binario");
            }else{
                System.out.println("El numero ingresado no se encuentra en el arbol bianario");
            }
        }
    }
}