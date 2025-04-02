            import java.util.*;

public class adivina{
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Hola en este juego vas a adivinar la palabra");
 String palabra = "scorpion";
 System.out.println("Tienes solo 5 intentos");
 int intentos = 0;

 String[] preguntasA = {"Sale en mortal kombat","Es una calavera","es de color amarillo","se teletransporta","usa un gancho"};

  for(int i = 0; i < preguntasA.length; i++){
    System.out.println((i + 1)+". "+ preguntasA[i]);
    String respuesta = scanner.nextLine();
    if(respuesta.equals(palabra)){
        System.out.println("Bien echo adivinaste el personaje que es: " + palabra);
        break;
    }
    else if(intentos >=5){
        System.out.println("Perdiste el personaje era: " + palabra);
        break;
    
   }
    }
    
}
}