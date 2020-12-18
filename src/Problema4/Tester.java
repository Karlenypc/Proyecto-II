package Problema4;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class Tester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BinarySearch methods = new BinarySearch();

        System.out.println("**BIENVENIDO**");
        System.out.print("Digite la cantidad de elementos del arreglo: ");
        int sizeArray = input.nextInt();

        // Declaracion del arreglo
        int[] array = new int[sizeArray];

        // Insertar elementos al arreglo 
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese un numero para la posicion [" + i + "] del arreglo: ");
            array[i] = input.nextInt();
        }

        // Este metodo requiere que el arreglo se encuentre ordenado
        methods.ordenarArray(array);
        methods.mostrarArray(array);
      
        while (true) {
            System.out.print("\nDigite el elemento buscado: ");
            int objective = input.nextInt();
            int result = methods.binarySearchRecursive(array, 0, sizeArray - 1, objective);
            System.out.println("- Resultado: ");
            if (result == -1) {
                System.out.println("El elemento buscado no ha sido encontrado.");

            } else {
                System.out.println("El elemento buscado se encuentra en la posicion [" + result + "] del arreglo.");
            }
        }
    }
}
