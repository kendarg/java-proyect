import java.util.*;
public class union{
    public static void main(String[] args){
        menu.ver();
    }
}
class menu{
    static Scanner scanner = new Scanner (System.in);
    static HashMap <String, String> usuarios = new HashMap<>();

    public static void ver(){
        while(true){
            System.out.println("------Menu------");
            System.out.println("1) Inicio de sesion");
            System.out.println("2) Resgistro");
            System.out.println("3) Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch(opcion){
                case 1:
                inicio();
                break;
                case 2:
                registro();
                break;
                case 3:
                System.out.println("Gracias buen día");
                return;
                case 4:
                System.out.println("Opcion invalida");
            }
        }
    }

    public static boolean seguridad(String contraseña){
        if(contraseña.length()<10){
            return false;
        }
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean digitos = false;
        boolean signos = false;
        for(char c : contraseña.toCharArray()){
            if(Character.isLetter(c)){
                minuscula = true;
                if(Character.isUpperCase(c)){
                    mayuscula = true;
                }
            }else if(Character.isDigit(c)){
                digitos = true;
            }else{
                signos = true;
            }

        }
        return minuscula && mayuscula && digitos && signos;

    } 

    private static void registro(){
        System.out.println("------Registro------");
        System.out.println("Ingrese nombre de usuario");
        String usuario = scanner.nextLine();
        if(usuarios.containsKey(usuario)){
        System.out.println("El usuario ya existe");
        return;       
        }
        while(true){
            System.out.println("Ingrese unac contraseña");
            String contraseña = scanner.nextLine();
            if(seguridad(contraseña)){
                System.out.println("Confirma tu contraseña");
                String contraseña2 = scanner.nextLine();
                if(contraseña2.equals(contraseña)){
                    usuarios.put(usuario, contraseña);
                    System.out.println("Registro completado");
                    break;
                }

        }else{
            System.out.println("Tu contraseña no es segura porfavor colocar minusculas, mayusculas, signos y digitos");

        }

    }}


    private static void inicio(){
        int intentos = 0;
        int max = 3;
        boolean correcto = false;
        System.out.println("------inicio de sesion------");
        while(intentos< max){
            System.out.println("Ingrese usuario");
            String usuario = scanner.nextLine();
            System.out.println("Ingres la contraseña");
            String contraseña = scanner.nextLine();
            if(usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contraseña)){
                System.out.println("Bien benido " + usuario);
                correcto = true;
                break;
            }else{
                intentos++;
                System.out.println("El usuario o contraseña no son correctos");
            }

        }if(!correcto){
            System.out.println("Usuario bloqueado");
        }
        
    }
}