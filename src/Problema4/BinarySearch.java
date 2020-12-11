package Problema4;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class BinarySearch {

    // Metodos binary_search
    
    public int binarySearchRecursive(int[] array, int left, int right, int objective) {

        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (array[mid] == objective) {
                return mid;
            } else if (array[mid] > objective) {
                return binarySearchRecursive(array, left, mid - 1, objective);
            } //     if (array[mid] < objective)
            else {
                return binarySearchRecursive(array, mid + 1, right, objective);
            }
        }
        return -1;
    }

    public void binarySearch(int[] array, int left, int right, int objective) {

        while (left <= right) {
            int mid = (right + left) / 2;

            if (objective == array[mid]) {
                System.out.println("El número buscado se encuentra en la posicion [" + mid + "] del arreglo.");
                break;

            } else if (objective < array[mid]) {
                right = mid - 1; // Recorre el arreglo hacia la izquierda

            } else {  // (objective > array[mid])
                left = mid + 1; // Recorre el arreglo hacia la derecha
            }

            if (right < left) {
                System.out.println("El número buscado no fue encontrado.");
            }
        }
    }

// Metodo de Ordenamiento de un array[]  **Burbuja**
    public void ordenarArray(int[] array) {

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

    //Metodo para mostrar un arreglo
    public void mostrarArray(int[] array) {
        System.out.println("\n**CONTENIDO DEL ARREGLO**");
        for (int e = 0; e < array.length; e++) {
            System.out.println("arreglo[" + e + "] = " + array[e]);
        }
    }
}
