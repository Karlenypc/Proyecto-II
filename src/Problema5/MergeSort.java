package Problema5;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class MergeSort {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[];

        System.out.println("**BIENVENIDO**");
        System.out.print("Digite la cantidad de elementos del arreglo: ");
        int sizeArray = entrada.nextInt();

        a = new int[sizeArray];
        b = new int[sizeArray];

        System.out.println("Digite el primer conjunto de datos:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero para la posicion [" + i + "] del arreglo: ");
            a[i] = entrada.nextInt();
        }

        System.out.println("Digite el segundo conjunto de datos:");
        for (int j = 0; j < b.length; j++) {
            System.out.print("Ingrese un numero para la posicion [" + j + "] del arreglo: ");
            b[j] = entrada.nextInt();
        }

        // Este metodo requiere que los arreglos a y b se encuentren ordenados.
        ordenarArray(a);
        ordenarArray(b);
        
        //Declaracion del arreglo mezclado
        int[] resultado = merge(a, b);

        //Mostrar resultado final del arreglo
        System.out.println("\n***CONTENIDO DEL ARREGLO***");
        System.out.println("Mezclado en forma Ordenada: ");
        System.out.print("{ ");
        for (int e = 0; e < resultado.length; e++) {
            System.out.print(resultado[e] + "  ");
        }
        System.out.println('}');
    }

    // MergeSort Algorithm
    public static int[] merge(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];

        //Pointer for each integer array []
        int aPointer, bPointer, resultPointer;
        aPointer = bPointer = resultPointer = 0;

        while (aPointer < a.length || bPointer < b.length) {

            if (aPointer < a.length && bPointer < b.length) {  // Ambos arreglos contienen elementos
                if (a[aPointer] < b[bPointer]) {
                    result[resultPointer] = a[aPointer];
                    resultPointer++;
                    aPointer++;

                } else {
                    result[resultPointer] = b[bPointer];
                    resultPointer++;
                    bPointer++;
                }

            } else if (aPointer < a.length) {                 // Solo un arreglo contiene elementos
                result[resultPointer++] = a[aPointer++];

            } else if (bPointer < b.length) {               // Solo un arreglo contiene elementos
                result[resultPointer++] = b[bPointer++];
            }
        }
        return result;
    }

    // Metodo de Ordenamiento 
    public static void ordenarArray(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }
}
