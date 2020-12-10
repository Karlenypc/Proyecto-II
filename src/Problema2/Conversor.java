package Problema2;

/**
 *
 * @author Karlenypc
 */
public class Conversor {

    
    Moneda monedaColon;
    Moneda monedaDolar;
    Moneda monedaEuro;

    //Metodos constructor
    public Conversor() {
    }

    public Conversor(Moneda monedaColon, Moneda monedaDolar, Moneda monedaEuro) {
        this.monedaColon = monedaColon;
        this.monedaDolar = monedaDolar;
        this.monedaEuro = monedaEuro;
    }

    // Metodo principal **Conversor**
    public float convertir(Moneda monedaOrigen, Moneda monedaSalida, float cantidadOrigen) {
        float resultado = 0;
        if (monedaOrigen != null && monedaSalida != null) {
            
            if (monedaOrigen.getNombre().equals("Colon")) {
                if (monedaSalida.getNombre().equals("Dolar")) {
                    resultado = cantidadOrigen / monedaDolar.getValorColon();

                } else if (monedaSalida.getNombre().equals("Euro")) {
                    resultado = cantidadOrigen / monedaEuro.getValorColon();

                } else { //Colon
                    resultado = cantidadOrigen;
                }

            } else if (monedaOrigen.getNombre().equals("Dolar")) {
                if (monedaSalida.getNombre().equals("Colon")) {
                    resultado = cantidadOrigen * monedaDolar.getValorColon();

                } else if (monedaSalida.getNombre().equals("Euro")) {
                    resultado = cantidadOrigen * monedaEuro.getValorColon();

                } else { //Dolar
                    resultado = cantidadOrigen;
                }

            } else if (monedaOrigen.getNombre().equals("Euro")) {
                if (monedaSalida.getNombre().equals("Colon")) {
                    resultado = cantidadOrigen * monedaEuro.getValorColon();

                } else if (monedaSalida.getNombre().equals("Dolar")) {
                    resultado = cantidadOrigen * (monedaEuro.getValorColon() / monedaDolar.getValorColon());

                } else { //Euro
                    resultado = cantidadOrigen;
                }

            } else {
                System.out.println("Seleccion no valida.");
            }
        } 

        return resultado;
    }

    public Moneda getMonedaColon() {
        return monedaColon;
    }

    public void setMonedaColon(Moneda monedaColon) {
        this.monedaColon = monedaColon;
    }

    public Moneda getMonedaDolar() {
        return monedaDolar;
    }

    public void setMonedaDolar(Moneda monedaDolar) {
        this.monedaDolar = monedaDolar;
    }

    public Moneda getMonedaEuro() {
        return monedaEuro;
    }

    public void setMonedaEuro(Moneda monedaEuro) {
        this.monedaEuro = monedaEuro;
    }

}
