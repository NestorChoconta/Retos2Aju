import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        int [] vector;
        int cantComp;
        String nombre;
        int tiempo;
        Scanner capturar=new Scanner(System.in);
        System.out.println("digite la cantidad de competidores");
        cantComp=capturar.nextInt();
        vector=new int [cantComp];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("digite el nombre");
            nombre=capturar.next();
            System.out.println("digite el tiempo");
            tiempo=capturar.nextInt();
            System.out.println("el nombre es"+nombre+"el tiempo es"+tiempo);
        }
        
    }
}
