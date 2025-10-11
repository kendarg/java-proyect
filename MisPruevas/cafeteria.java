import java.util.*;

public class cafeteria {
    public static void main(String[] args){ 

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bien benido que vas a tomar el dia de hoy");
        System.out.println("1) Solo Cafe Match");
        System.out.println("2) Solo Cafe de Helado");
        System.out.println("3) Solo Cafe Normal");
        System.out.println("4) Mas de un articulo");
        int lista = scanner.nextInt();
        scanner.nextInt();
        if(lista == 1){

            System.out.println("Quieres vainilla");
            String respuesta = scanner.nextLine();
            scanner.nextLine();
            if(respuesta.equals("Si")){
                System.out.println("Cuantos quieres? ");
                int vainilla = scanner.nextInt();
                scanner.nextInt();
            }else{System.out.println("Vale entonces tu pedido es Cafe Macht" + 
        " Cantidad de vainilla" + vainilla );}}

        if(lista == 2){
        System.out.println("Quieres vainilla");
        String respuesta = scanner.nextLine();
        scanner.nextLine();
        if(respuesta.equals("Si")){
            System.out.println("Cuantos quieres? ");
            int vainilla = scanner.nextInt();
            scanner.nextInt();
        }else{System.out.println("Vale entonces tu pedido es Cafe de Helado" +  
        " Cantidad de vainilla" + vainilla);}}

        if(lista == 3){
        System.out.println("Quieres vainilla");
        String respuesta = scanner.nextLine();
        scanner.nextLine();
        if(respuesta.equals("Si")){
            System.out.println("Cuantos quieres? ");
            int vainilla = scanner.nextInt();
            scanner.nextInt();
        }else{System.out.println("Vale entonces tu pedido es Cafe Normal" +  
        " Cantidad de vainilla" + vainilla);}}

        if(lista == 4){
            System.out.println("Cafe Match");
            System.out.println("Cuantos cuantos quieres?");
            int Match = scanner.nextInt();
                scanner.nextInt();

            System.out.println("Cafe Helado");
            int Helado = scanner.nextInt();
                scanner.nextInt();

            System.out.println("Cafe Normal");
            int Normal = scanner.nextInt();
                scanner.nextInt();

            System.out.println("Cuanto de vainilla");
            int vainilla = scanner.nextInt();
            scanner.nextInt();
            System.out.println("Tu pedido es: ");
            System.out.println("Cafe Matcha: " + Match);
            System.out.println("Cafe Helado: " + Helado);
            System.out.println("Cafe Normal: " + Normal);
            System.out.println("Vainilla: " + vainilla );

        
        
        }

    }

}

