import java.util.*;

public class e1_1{
    static class Persona{
        String nombre;
        int edad;
        String apellido;
        String cargo;
        int cargos = 0;
        int digito = 0;
    void mostrarInfo(){
        System.out.println("Tu nombre es: "+ nombre + " " + apellido );
        System.out.println("Tu edad es: " + edad + " Tu cargo es: " + cargo);
        System.out.println("Tu digito es: " + digito + " Tu numero de cargo es: " + cargos);
    }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Persona p1 = new Persona();

        while(true){
            p1.cargos++;
            p1.digito++;
            System.out.println("Ingresa los datos para termiar escribe salir");
            System.out.println("Ingresa tu nombre");
            p1.nombre = sc.nextLine();
            if(p1.nombre.equals("salir")){
              System.out.println("Fin del programa");
              break;
            }
            System.out.println("Ingres tu apellido");
            p1.apellido = sc.nextLine();
            if(p1.apellido.equals("salir")){
              System.out.println("Fin del programa");
              break;
            }
            System.out.println("Ingresa tu cargo");
            p1.cargo = sc.nextLine();
            System.out.println("Ingresa tu edad");
            p1.edad = sc.nextInt();
            // if(p1.cargo.equals("salir")){
            //   System.out.println("Fin del programa");
            //   break;
            // }
          p1.mostrarInfo();
        }


    }
}