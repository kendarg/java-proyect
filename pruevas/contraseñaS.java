import java.util.*;

public class contraseñaS{

    public static boolean seguridad(String contraseña){
        if(contraseña.length()<10){
            return false;
        }
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean datos = false;
        boolean simbolos = false;
        for(char c : contraseña.toCharArray()){
            if(Character.isLetter(c)){
                minuscula = true;
                if(Character.isUpperCase(c)){
                    mayuscula = true;

                }
            }else if(Character.isDigit(c)){
                datos = true;

            }else{
                simbolos = true;
            }

        }
        return mayuscula && minuscula && datos && simbolos;
    }

    public static void main(String[] args){
        int inten = 0;
        int max = 1;
        Scanner scanner = new Scanner(System.in);
        while(inten < max){
            System.out.println("ingresa tu contraseña");
            String contraseña = scanner.nextLine();
            if(seguridad(contraseña)){
                System.out.println("Tu contraseña es segura");
                break;
            }else{
                System.out.println("Tu contraseña no es segura porfavor colocar mayusculas, minusculas y simbolos (!¡?¿)");
                System.out.println("Devede ser minimo de 10 digitos");
            }
        }
    }
}