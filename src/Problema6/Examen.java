package Problema6;

/**
 *
 * @author Karlenypc
 */
public class Examen {

    Alumno alumno;
    int nota;
    int puntosTotal;
    int puntosObtenidos;

    public Examen() {
    }

    public Examen(Alumno alumno, int nota, int puntosTotal, int puntosObtenidos) {
        this.alumno = alumno;
        this.nota = nota;
        this.puntosTotal = puntosTotal;
        this.puntosObtenidos = puntosObtenidos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getPuntosTotal() {
        return puntosTotal;
    }

    public void setPuntosTotal(int puntosTotal) {
        this.puntosTotal = puntosTotal;
    }

    public int getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(int puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public String toString() {
        return "Examen {" + "Nota: " + nota + " Puntos Totales: " + puntosTotal + " Puntos Obtenidos: " + puntosObtenidos + '}';
    }
    
}
