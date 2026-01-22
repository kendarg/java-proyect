public class poo1 {
    public static void main(String[] args) {
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
String nombre;
int edad;
Persona(String nombre, int edad){
this.nombre = nombre;
this.edad = edad;
}
void mostrar(){
  System.out.println("Tu nombre es: " + nombre);
  System.out.println("Tu edad es: " + edad);
}

}
// se usa extends para crear las herencias de una clase
class Carrera extends Persona{
  String info;
  public Carrera(String nombre, int edad, String info){
    // super entiendo que funciona para llamnar a los demas y crear una la clase con los parametros de su padre que en este caso es Persona
    super(nombre, edad);
    this.info = info;
  }
  // se usa   @Override para modificar la informacion de los datos anteriores o sobre escribir estos
  @Override
  void mostrar(){
  System.out.println("Tu nombre es: " + nombre);
  System.out.println("Tu edad es: " + edad);
  System.out.println("Tu carrera es: " + info);
}
}


