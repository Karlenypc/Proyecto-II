package Problema6;

/**
 *
 * @author Karlenypc
 */
public class SistemaNotasReporte {

    int maxRegistro = 1000;                       //Variable Global Max de Registros
    Examen[] examenes = new Examen[maxRegistro];
    int contador = 0;                             //Contador Registros

    public SistemaNotasReporte() {
    }

    //agregar un examen al arreglo
    public boolean agregarEx(Examen ex) {
        boolean resultado = false;
        if (contador < maxRegistro) {       //el arreglo tiene espacio
            examenes[contador] = ex;
            contador++;
            resultado = true;
        }
        return resultado;
    }

    //elimina el ult examen del arreglo
    public boolean eliminarEx() {
        boolean resultado = false;
        if (contador != 0) {
            examenes[contador - 1] = null;
            contador--;
            resultado = true;
        }

        return resultado;
    }

    public String generarReporteTodosExamenes() {
        String resultado = "";
        for (int i = 0; i < contador; i++) {
            if (examenes[i] != null) {
                resultado = resultado + examenes[i].getAlumno().toString();
                resultado = resultado + examenes[i].toString();
            }
        }
        return resultado;
    }

    public String generarReporteTodosAlumnos() {
        String resultado = "";
        for (int i = 0; i < contador; i++) {
            if (examenes[i] != null) {
                resultado = resultado + examenes[i].alumno.toString();
            }
        }
        return resultado;
    }

    // Si la nota es inferior a 65 
    public String generarReporteTodosAlumnosNotaInferiorA(int nota) {
        String resultado = "";
        for (int i = 0; i < contador; i++) {
            if (examenes[i] != null && examenes[i].nota < 65) {
                resultado += examenes[i].alumno.toString();
                resultado += examenes[i].alumno.padre.toString();
                resultado += examenes[i].alumno.madre.toString();
            }
        }
        return resultado;
    }

    public String generarReporteExamenesOrdenadosPor(int nota) {
        String resultado = "";
        for (int i = 0; i < contador; i++) {
            if (examenes[i] != null) {
                if (examenes[i].nota > examenes[i + 1].nota) {
                    resultado += examenes[i].getAlumno().toString();
                    resultado += examenes[i].toString();
                } else {
                    resultado += examenes[i+1].getAlumno().toString();
                    resultado += examenes[i+1].toString();
                }
            }
        }
        return resultado;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
