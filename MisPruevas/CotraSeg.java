import java.util.*;

public class CotraSeg {
    public static boolean seguridad(String contraseña){ 
        if (contraseña.length() < 10) {
            return false;            
        }
    boolean mayuscula = false;
    boolean minuscula = false;
    boolean sinbolos = false;
    boolean digito = false;
    for(char c : contraseña.toCharArray()){
        if(Character.isLetter(c)){
            minuscula = true;
            if (Character.isUpperCase(c)) {
                mayuscula = true;                
            }
        }else if(Character.isDigit(c)){
            digito = true;
        }else{
            sinbolos = true;
        }
    }
    return mayuscula && minuscula && sinbolos && digito;
    }



    public static void main(String[] args){
        int mini = 0;
        int max = 10;
        Scanner scanner = new Scanner(System.in);
        while(mini < max){
            System.out.println("Ingresa tu contraseña");
            String contraseña = scanner.nextLine();
            if(seguridad(contraseña)){
                System.out.println("Tu contraseña es segura");
                break;
            }else{
                System.out.println("Tu contraseña no es segura porfavor use mayusculas, minusculas, sinmbolos especiales como (+!?¡¿*)");
                System.out.println("Ademas deve deser minimo de 10 digitos");
            }
            scanner.close();
        }


    }

}
