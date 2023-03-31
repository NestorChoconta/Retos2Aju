public class Ejercicio33 {
    public static void main(String[] args) {
        String [][] emojis;
        int filas;
        int columnas;
       Scanner capturar =new Scanner(System.in); 
        System.out.println("digite la cantidad de filas");
        filas=capturar.nextInt();
        System.out.println("digite la cantidad de columnas");
        columnas=capturar.nextInt();

        emojis=new String[filas][columnas];
        
        //emojis[0][0]=";(";
        //emojis[0][1]=";(";
        //emojis[0][2]=";(";
        //emojis[0][3]=";(";
        //emojis[0][4]=";(";

        for (int i = 0; i < filas; i++) { 
            for (int j = 0; j < columnas; j++){
            System.out.println("digite el emoji");
            emojis [i][j]=capturar.next();
        }
        System.out.println("");
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
            System.out.print(emojis[i][j]+"\t"); 
        }
        System.out.println(""); 
        }
        capturar.close(); 
    }
} 