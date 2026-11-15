import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arreglo = leerArreglo(sc);
        System.out.println("Original: " + Arrays.toString(arreglo));
        System.out.println("Ordenado: " + Arrays.toString(ordenarBurbuja(arreglo)));

        sc.close();
    }

    public static int[] leerArreglo(Scanner sc) {
        int tamanio;
        do {
            System.out.print("Tamaño del arreglo: ");
            tamanio = sc.nextInt();
        } while (tamanio <= 0);

        int[] arreglo = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            System.out.print("Elemento [" + i + "]: ");
            arreglo[i] = sc.nextInt();
        }
        return arreglo;
    }

    // Burbuja: compara elementos contiguos e intercambia los desordenados
    public static int[] ordenarBurbuja(int[] arreglo) {
        int[] resultado = Arrays.copyOf(arreglo, arreglo.length);

        for (int i = 0; i < resultado.length - 1; i++) {
            for (int j = 0; j < resultado.length - 1 - i; j++) {
                if (resultado[j] > resultado[j + 1]) {
                    int temporal = resultado[j];
                    resultado[j] = resultado[j + 1];
                    resultado[j + 1] = temporal;
                }
            }
        }
        return resultado;
    }
}
