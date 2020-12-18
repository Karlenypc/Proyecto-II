package Problema6;

/**
 *
 * @author Karlenypc
 */
public class Alumno {
    
    //Propiedades 
    String nombre;
    String apellido;
    int carnet;
    PadreFamiliar padre;
    PadreFamiliar madre;

    //Metodo Constructor
    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int carnet, PadreFamiliar padre, PadreFamiliar madre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.padre = padre;
        this.madre = madre;
    }

    //Sobrecarga metodo constructor 
    public Alumno(String nombre, String apellido, int carnet) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
    }

    public Alumno(PadreFamiliar padre, PadreFamiliar madre) {
        this.padre = padre;
        this.madre = madre;
    }

    //Metodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public PadreFamiliar getPadre() {
        return padre;
    }

    public void setPadre(PadreFamiliar padre) {
        this.padre = padre;
    }

    public PadreFamiliar getMadre() {
        return madre;
    }

    public void setMadre(PadreFamiliar madre) {
        this.madre = madre;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + "\n Apellido: " + apellido + "\n Carne: " + carnet + "\n";
    }
}
