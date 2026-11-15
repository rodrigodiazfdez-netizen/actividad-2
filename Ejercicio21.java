import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arreglo = leerArreglo(sc);
        System.out.println("Original: " + Arrays.toString(arreglo));
        System.out.println("Invertido: " + Arrays.toString(invertir(arreglo)));

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

    // El primer elemento pasa a ser el último, el segundo el penúltimo, etc.
    public static int[] invertir(int[] arreglo) {
        int[] resultado = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            resultado[i] = arreglo[arreglo.length - 1 - i];
        }
        return resultado;
    }
}
