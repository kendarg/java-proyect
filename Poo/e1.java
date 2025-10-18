public class e1{
   static class Persona{
        String nombre;
        int edad;
        String ciudad;
        String apellido;
    }
        public static void main(String[] args){
            Persona p1 = new Persona();
            p1.nombre = "Kendarg";
            p1.edad = 23;
            p1.ciudad = "Socha";
            p1.apellido = "Real";
            System.out.println("Tu nombre es: " + p1.nombre + " Tu apellido es: " + p1.apellido + " Tu edad es: " + p1.edad + " Vives en: " + p1.ciudad);
        }
    
}