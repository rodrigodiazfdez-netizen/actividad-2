import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanio;
        do {
            System.out.print("Tamaño de ambos arreglos: ");
            tamanio = sc.nextInt();
        } while (tamanio <= 0);

        int[] a = leerElementos(sc, tamanio, "Arreglo A");
        int[] b = leerElementos(sc, tamanio, "Arreglo B");

        System.out.println("A: " + Arrays.toString(a));
        System.out.println("B: " + Arrays.toString(b));
        System.out.println("Intercalado: " + Arrays.toString(intercalar(a, b)));

        sc.close();
    }

    public static int[] leerElementos(Scanner sc, int tamanio, String nombre) {
        int[] arreglo = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            System.out.print(nombre + " - elemento [" + i + "]: ");
            arreglo[i] = sc.nextInt();
        }
        return arreglo;
    }

    // Resultado: a[0], b[0], a[1], b[1], ...
    public static int[] intercalar(int[] a, int[] b) {
        int[] resultado = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            resultado[2 * i] = a[i];
            resultado[2 * i + 1] = b[i];
        }
        return resultado;
    }
}
