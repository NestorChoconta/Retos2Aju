import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        String [][] matriz;
        String nombre;
        int precio;
        Scanner capturar=new Scanner(System.in);
        matriz=new String[2][2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("digite el nombre del producto");
                matriz[i][j]=capturar.next();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][j]+"\t"); 
            }
           
        }
    }
}
