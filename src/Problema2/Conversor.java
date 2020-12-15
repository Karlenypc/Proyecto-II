package Problema2;

/**
 *
 * @author Karlenypc
 */
public class Conversor {

    Moneda monedaColon;
    Moneda monedaDistintaColon1;
    Moneda monedaDistintaColon2;

    //Metodos constructor
    public Conversor() {
    }

    public Conversor(Moneda monedaColon, Moneda monedaDistintaColon1, Moneda monedaDistintaColon2) {
        this.monedaColon = monedaColon;
        this.monedaDistintaColon1 = monedaDistintaColon1;
        this.monedaDistintaColon2 = monedaDistintaColon2;
    }

    // Metodo principal **Conversor**
    public float convertir(Moneda monedaOrigen, Moneda monedaSalida, float cantidadOrigen) {
        float resultado = 0;
        if (monedaOrigen != null && monedaSalida != null) {

            if (monedaOrigen.getNombre().equals("Colon")) {
                if (monedaSalida.getNombre().equals("Dolar")) {
                    resultado = cantidadOrigen / monedaDistintaColon1.getValorColon();

                } else if (monedaSalida.getNombre().equals("Euro")) {
                    resultado = cantidadOrigen / monedaDistintaColon2.getValorColon();

                } else { //Colon
                    resultado = cantidadOrigen;
                }

            } else if (monedaOrigen.getNombre().equals("Dolar")) {
                if (monedaSalida.getNombre().equals("Colon")) {
                    resultado = cantidadOrigen * monedaDistintaColon1.getValorColon();

                } else if (monedaSalida.getNombre().equals("Euro")) {
                    resultado = cantidadOrigen * monedaDistintaColon2.getValorColon();

                } else { //Dolar
                    resultado = cantidadOrigen;
                }

            } else if (monedaOrigen.getNombre().equals("Euro")) {
                if (monedaSalida.getNombre().equals("Colon")) {
                    resultado = cantidadOrigen * monedaDistintaColon2.getValorColon();

                } else if (monedaSalida.getNombre().equals("Dolar")) {
                    resultado = cantidadOrigen * (monedaDistintaColon2.getValorColon() / monedaDistintaColon1.getValorColon());

                } else { //Euro
                    resultado = cantidadOrigen;
            }

            } else {
                System.out.println("Seleccion no valida.");
            }

        }
        resultado = (int) resultado;
        return resultado;
    }

    public Moneda getMonedaColon() {
        return monedaColon;
    }

    public void setMonedaColon(Moneda monedaColon) {
        this.monedaColon = monedaColon;
    }

    public Moneda getMonedaDistintaColon1() {
        return monedaDistintaColon1;
    }

    public void setMonedaDistintaColon1(Moneda monedaDistintaColon1) {
        this.monedaDistintaColon1 = monedaDistintaColon1;
    }

    public Moneda getMonedaDistintaColon2() {
        return monedaDistintaColon2;
    }

    public void setMonedaDistintaColon2(Moneda monedaDistintaColon2) {
        this.monedaDistintaColon2 = monedaDistintaColon2;
    }

}
