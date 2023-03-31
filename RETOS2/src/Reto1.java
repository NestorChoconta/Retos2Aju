import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        float [] vector;
        int cantNotas;
        float promedio;
        float contador=0;
        Scanner capturar=new Scanner(System.in);
        System.out.println("digite el numero de notas que desea evaluar");
        cantNotas=capturar.nextInt();
        vector=new float [cantNotas];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("digite la nota");
            vector [i]=capturar.nextInt();
            contador=contador+vector[i];
        }  
        promedio=contador/cantNotas;
        System.out.println("su promedio es"+"\n"+promedio);
        capturar.close();
        if (promedio<30) {
            System.out.println("usted reprobó");
        }else if (promedio>=30 && promedio<=40) {
            System.out.println("usted paso raspando");
        }else if (promedio>40 || promedio<=50) {
            System.out.println("aprobaste con buenos resultados");
        }
    }
}
