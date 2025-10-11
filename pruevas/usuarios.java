import java.util.*;
public class usuarios{
    public static void main(String[] args){
        menu.ver();
    }
}
    
    class menu{
        static Scanner scanner = new Scanner(System.in);
        static HashMap<String, String> usuarios = new HashMap<>();
        public static void ver(){
            while(true){
                System.out.println("Bienvenido escoge una opcion");
                System.out.println("1) Inisiar sesion");
                System.out.println("2) Registrar");
                System.out.println("3) Salir");
                int opcion = scanner.nextInt();
                scanner.nextLine();
                switch(opcion){
                    case 1:
                    ingreso();
                    break;
                    case 2:
                    registro();
                    break;
                    case 3:
                    System.out.println("Gracias buen día.");
                    return;
                    default:
                    System.out.println("opcion no valida");

                }
            }

        }
    private static void ingreso(){
        System.out.println("----------Iniciar sesion----------");
        System.out.println("Ingrese usuario");
        String usuario = scanner.nextLine();
        System.out.println("Contraseña");
        String contraseña = scanner.nextLine();
        if(usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contraseña)){
            System.out.println("Bien benido " + usuario);
        }else{
            System.out.println("El usuario o contraseña son incorrectos");
        }
    }
    private static void registro(){
        System.out.println("----------Registro----------");
        System.out.println("Ingresa nombre del usuario");
        String usuario = scanner.nextLine();
        if(usuarios.containsKey(usuario)){
            System.out.println("El nombre del usuario ya existe");
            return;
        }
        System.out.println("Ingrese una contraseña");
        String contraseña = scanner.nextLine();
        System.out.println("Confirma tu contraseña");
        String contraseña2 = scanner.nextLine();
        if(contraseña2.equals(contraseña)){
            usuarios.put(usuario, contraseña);
            System.out.println("Usuario y contraseña guardados");
            
        }else{
            System.out.println("La contraseña no son iguales");
            return;
        }

    }
}