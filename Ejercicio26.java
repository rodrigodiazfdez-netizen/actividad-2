import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de filas (n): ");
        int filas = sc.nextInt();
        System.out.print("Número de columnas (m): ");
        int columnas = sc.nextInt();

        int[][] matriz = leerMatriz(sc, filas, columnas);

        System.out.println("\nMatriz original:");
        imprimirMatriz(matriz);
        System.out.println("\nMatriz transpuesta:");
        imprimirMatriz(transponer(matriz));

        sc.close();
    }

    public static int[][] leerMatriz(Scanner sc, int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    // Las filas pasan a ser columnas: resultado[j][i] = matriz[i][j]
    public static int[][] transponer(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] resultado = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[j][i] = matriz[i][j];
            }
        }
        return resultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
