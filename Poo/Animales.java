public class Animales {
    static void Nadar(Acuatico criatura) {
        criatura.acuatico();
    }
    static void Caminar(Terrestre criatura){
        criatura.caminar();
    }
    static void Volador(Volador criatura){
        criatura.volar();
    }
    public static void main(String[] args) {
    Pato lucas = new Pato();
    Pez nemo = new Pez(); 
    Perro manolo = new Perro();
    Pajaro Kala = new Pajaro();
    
    Volador(lucas);
    Volador(Kala);
    Caminar(manolo);
    Caminar(lucas);
    Nadar(lucas);
    Nadar(nemo);
    }
}
// se usa interface ya que java no permite el uso de multiples herencias 

interface Volador {
void volar();    
}
interface Acuatico {
void acuatico();    
}
interface Terrestre {
void caminar();    
}


class Animal{
String nombre;
}

    //aca creamos las herencias para poder usar lo que es el interface pero este se llama con implements ya que se esta implementando la interfas
    
    class Perro extends Animal implements Terrestre{
        public void caminar(){
            System.out.println("El Perro puede caminar por el parque");
        }
    }

    class Pajaro extends Animal implements Volador{
        public void volar(){
            System.out.println("El Pajaro puede volar por el parque");
        }
    }

    class Pez extends Animal implements Acuatico{
        public void acuatico(){
            System.out.println("El Pez puede nadar por el estanque");
        }
    }

    class Pato extends Animal implements Volador, Terrestre, Acuatico{
        public void caminar(){
            System.out.println("El Pato puede caminar por el parque");
            
        }
        public void volar(){
            System.out.println("El Pato puede volar por el parque");

        }
        public void acuatico(){
            System.out.println("El Pato puede nadar por el estanque");

        }
    }
