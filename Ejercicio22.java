import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arreglo = leerArreglo(sc);
        System.out.print("Número a buscar: ");
        int numero = sc.nextInt();

        if (buscar(numero, arreglo)) {
            System.out.println("El número " + numero + " SÍ está en el arreglo.");
        } else {
            System.out.println("El número " + numero + " NO está en el arreglo.");
        }

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

    // Búsqueda lineal: recorre el arreglo hasta encontrar el número
    public static boolean buscar(int numero, int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                return true;
            }
        }
        return false;
    }
}
