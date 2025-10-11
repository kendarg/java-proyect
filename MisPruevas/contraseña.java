import java.util.*;


public class  contraseña{
public static void main(String [] args){
    Scanner contra = new Scanner(System.in);
    int max = 3;
    int intentos = 0;
    String palabra = "perro";
    String usuario = "Pablo";
    boolean correcto = false;
    while(intentos < max){
        System.out.println("Ingresa la contraseña");
        String respuesta = contra.nextLine();
        if(respuesta.equals(palabra)){
            System.out.println("Bien benido usuario " + usuario);
            correcto = true;
            break;
        }else{
            intentos++;
            System.out.println("Vuelve a intentarlo");
        }
   }
   if(!correcto){
    System.out.println("Usuario bloqueado");
   }


    }
}