public class union {
    public static int multiples(int[] channelcodes){
        int resultado = 1;
        for(int i=0; i<channelcodes.length;i++){
            resultado *=channelcodes[i];
        }
        return resultado;
    }
    public static int multiples(int a, int b, int c){
        return a*b*c;
    }
    public static double multiples(double a, double b){
        return a*b;
    }
    public static void main(String[] args){
        System.out.println("Interaccion 1" + multiples(new int[] {1, 2, 3, 4, 5} ));
        System.out.println("Interaccion 2" + multiples(2,2,3));
        System.out.println("Interaccion 3" + multiples(7,10));
        System.out.println("Interaccion 4" + multiples(234.21,0.2));
        System.out.println("Interaccion 5" + multiples(0.1,0.2));
    }
}
