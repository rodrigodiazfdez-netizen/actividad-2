import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arreglo = leerArreglo(sc);
        System.out.println("Original: " + Arrays.toString(arreglo));
        System.out.println("Sin duplicados: " + Arrays.toString(eliminarDuplicados(arreglo)));

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

    // Conserva solo la primera aparición de cada número
    public static int[] eliminarDuplicados(int[] arreglo) {
        int[] temporal = new int[arreglo.length];
        int cantidad = 0;

        for (int i = 0; i < arreglo.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < cantidad; j++) {
                if (temporal[j] == arreglo[i]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                temporal[cantidad] = arreglo[i];
                cantidad++;
            }
        }
        return Arrays.copyOf(temporal, cantidad);
    }
}
