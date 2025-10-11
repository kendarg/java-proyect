import java.util.*;

public class contraseña{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int inten = 0;
    int max = 3;
    String contra = "Dragon";
    String usuario = "Esteban";
    boolean correcto = false;
    System.out.println("Bienvenido");
    while(inten < max){
        System.out.println("Coloca la contraseña:");
        String resultado = scanner.nextLine();
        if(resultado.equals(contra)){
            System.out.println("Bienvenido usuario: " +  usuario);
            correcto = true;
            break;
        }else{
            inten++;
            System.out.println("Contraseña incorrecta vuelce a intentar");
            
        }
        
    }if(!correcto){
        System.out.println("Maximo de Intentos usados usuario bloqueado");
    }
}

}