public class poo1 {
    public static void main(String[] args) {
      // aca la calse es Carrera y Persona y los objetos son los creados apartir de las clases osea c1, c2 y c3.
      Carrera c1 = new Carrera("Esteban", 23, "ingeniero");
      Persona c2 = new Persona("Lia", 44);
      Carrera c3 = new Carrera("Arturo", 24, "chef");
      c1.mostrar();
      c2.mostrar();
      c3.mostrar();
      
    }
}
class Persona{
  // uso de encapsulamiento conmetodo private

  private String nombre;
  private int edad;

  // se usa get para obtener la informacion que esta con private

  public int getedad(){
  return edad;
  }
  public String getnombre(){
    return nombre;
  }

  Persona(String nombre, int edad){
  this.nombre = nombre;
  this.edad = edad;
  }
  void mostrar(){
    System.out.println("Tu nombre es: " + getnombre());
    System.out.println("Tu edad es: " + getedad());
    System.out.println("------------------------");
  }
}

// se usa extends para crear las herencias de una clase

class Carrera extends Persona{
    private String info;
    public String getinfo(){
    return info;
    }
    public Carrera(String nombre, int edad, String info){
      // super entiendo que funciona para llamnar a los demas y crear una la clase con los parametros de su padre que en este caso es Persona
      super(nombre, edad);
      this.info = info;
    }
    // se usa   @Override para modificar la informacion de los datos anteriores o sobre escribir estos
    @Override
  void mostrar(){
    System.out.println("Tu nombre es: " + getnombre());
    System.out.println("Tu edad es: " + getedad());
    System.out.println("Tu carrera es: " + getinfo());
    System.out.println("------------------------");
  }
}