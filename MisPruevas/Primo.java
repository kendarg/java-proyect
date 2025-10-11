// import java.util.*;

// public class Primo{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         int number = scanner.nextInt();
//         int sum = number;

//         in pri= 7 % 7(7);
//         for(int i = sum; i >=sum; i--){
//             System.out.println("intento" + sum);

//         }
//         if(sum == 1){
//             System.out.println("El numero si es primo" + number);
//         }else{
//             System.out.println("No es primo" + number);
//         }
//     }
// }
public static boolean Primo(int n) {
    // Los números menores que 2 no son primos
    if (n < 2) {
        return false;
    }
    // Verificar divisibilidad desde 2 hasta la raíz cuadrada de n
    // Solo es necesario verificar hasta la raíz cuadrada de n para optimizar
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false; // Si n es divisible por i, no es primo
        }
    }
    return true; // Si no se encontraron divisores, es primo
}

public static void main(String[] args) {
    int numero = 17; // Puedes cambiar este número para probar
    if (Primo(numero)) {
        System.out.println("El número " + numero + " es primo.");
    } else {
        System.out.println("El número " + numero + " no es primo.");
    }
}