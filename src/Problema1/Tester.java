package Problema1;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class Tester {

    public static void main(String args[]) {

        //CONFIGURACION MONEDAS (segun lo establecido en el problema)
        Moneda mColon = new Moneda("Colon", 1);
        Moneda mDolar = new Moneda("Dolar", 500);
        Moneda mEuro = new Moneda("Euro", 765);

        //Comienzo ejecucion del programa
        Scanner in = new Scanner(System.in);
        Conversor c = new Conversor(mColon, mDolar, mEuro);
        //c.setMonedaColon(mColon);
        //c.setMonedaDolar(mDolar);
        //c.setMonedaEuro(mEuro);
        int mOrigen;

        do {
            System.out.println("SELECCIONE EL TIPO DE MONEDA.");
            System.out.println("1) Colon");
            System.out.println("2) Dolar");
            System.out.println("3) Euro");
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
                            System.out.println("El valor equivalente es: " + c.convertir(mColon, mDolar, cantidad));

                        } else { //Euro
                            System.out.println("El valor equivalente es: " + c.convertir(mColon, mEuro, cantidad));
                        }
                        break;
                    }

                    case 2: { //DOLAR
                        if (mSalida == 1) { //Colon
                            System.out.println("El valor equivalente es: " + c.convertir(mDolar, mColon, cantidad));

                        } else if (mSalida == 2) { //Dolar
                            System.out.println("El valor equivalente es: " + c.convertir(mDolar, mDolar, cantidad));

                        } else { //Euro
                            System.out.println("El valor equivalente es: " + c.convertir(mDolar, mEuro, cantidad));
                        }
                        break;
                    }

                    case 3: { //EURO
                        if (mSalida == 1) { //Colon
                            System.out.println("El valor equivalente es: " + c.convertir(mEuro, mColon, cantidad));

                        } else if (mSalida == 2) { //Dolar
                            System.out.println("El valor equivalente es: " + c.convertir(mEuro, mDolar, cantidad));

                        } else {  //Euro
                            System.out.println("El valor equivalente es: " + c.convertir(mEuro, mEuro, cantidad));
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
