import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de filas (n): ");
        int filas = sc.nextInt();
        System.out.print("Número de columnas (m): ");
        int columnas = sc.nextInt();

        int[][] a = leerMatriz(sc, filas, columnas, "Matriz A");
        int[][] b = leerMatriz(sc, filas, columnas, "Matriz B");

        System.out.println("\nMatriz A:");
        imprimirMatriz(a);
        System.out.println("\nMatriz B:");
        imprimirMatriz(b);
        System.out.println("\nA + B:");
        imprimirMatriz(sumarMatrices(a, b));

        sc.close();
    }

    public static int[][] leerMatriz(Scanner sc, int filas, int columnas, String nombre) {
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(nombre + " - posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    // Suma cada posición de A con la misma posición de B
    public static int[][] sumarMatrices(int[][] a, int[][] b) {
        int[][] resultado = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
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
