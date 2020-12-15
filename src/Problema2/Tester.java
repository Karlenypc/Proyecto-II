package Problema2;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class Tester {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        //CONFIGURACION MONEDAS 
        Moneda mColon = new Moneda("Colon", 1);
        Moneda distintaColon1 = new Moneda();
        Moneda distintaColon2 = new Moneda();

        //Establecimiento de valores por parte del usuario en tiempo de ejecución
        System.out.print("Ingrese el nombre de la moneda distinta del colon 1: ");
        distintaColon1.setNombre(in.next());
        System.out.print("Ingrese el cambio bancario vigente: ");
        distintaColon1.setValorColon(in.nextFloat());
        System.out.print("Ingrese el nombre de la moneda distinta del colon 2: ");
        distintaColon2.setNombre(in.next());
        System.out.print("Ingrese el cambio bancario vigente: ");
        distintaColon2.setValorColon(in.nextFloat());

        Conversor c = new Conversor();
        c.setMonedaColon(mColon);
        c.setMonedaDistintaColon1(distintaColon1);
        c.setMonedaDistintaColon2(distintaColon2);
        int mOrigen;

        do {
            System.out.println("SELECCIONE EL TIPO DE MONEDA.");
            System.out.println("1) Colon");
            System.out.println("2) " + distintaColon1.getNombre());
            System.out.println("3) " + distintaColon2.getNombre());
            System.out.print("...de Origen: ");
            mOrigen = in.nextInt();
            System.out.print("...de Salida: ");
            int mSalida = in.nextInt();
            if (mOrigen < 4 && mSalida < 4) {
                System.out.print("Ingrese la cantidad de unidades monetarias que desea convertir:");
                int cantidad = in.nextInt();

                switch (mOrigen) {

                    case 1: { // COLON
                        if (mSalida == 1) { //Colon
                            System.out.println("El valor equivalente es: " + c.convertir(mColon, mColon, cantidad));

                        } else if (mSalida == 2) { //Dolar
                            System.out.println("El valor equivalente es: " + c.convertir(mColon, distintaColon1, cantidad));

                        } else { //Euro
                            System.out.println("El valor equivalente es: " + c.convertir(mColon, distintaColon2, cantidad));
                        }
                        break;
                    }

                    case 2: { //DOLAR
                        if (mSalida == 1) { //Colon
                            System.out.println("El valor equivalente es: " + c.convertir(distintaColon1, mColon, cantidad));

                        } else if (mSalida == 2) { //Dolar
                            System.out.println("El valor equivalente es: " + c.convertir(distintaColon1, distintaColon1, cantidad));

                        } else { //Euro
                            System.out.println("El valor equivalente es: " + c.convertir(distintaColon1, distintaColon2, cantidad));
                        }
                        break;
                    }

                    case 3: { //EURO
                        if (mSalida == 1) { //Colon
                            System.out.println("El valor equivalente es: " + c.convertir(distintaColon2, mColon, cantidad));

                        } else if (mSalida == 2) { //Dolar
                            System.out.println("El valor equivalente es: " + c.convertir(distintaColon2, distintaColon1, cantidad));

                        } else {  //Euro
                            System.out.println("El valor equivalente es: " + c.convertir(distintaColon2, distintaColon2, cantidad));
                        }
                        break;
                    }
                }
            } else {
                System.out.println("ERROR \nSeleccion no valida. Por favor seleccione nuevamente.\n");
            }
        } while (true);
    }
}
