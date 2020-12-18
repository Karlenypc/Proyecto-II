package Problema6;

/**
 *
 * @author Karlenypc
 */
public class SistemaNotasReporte {

    int maxRegistro = 1000;                       //Variable Global Max de Registros
    Examen[] examenes = new Examen[maxRegistro];
    Alumno[] alumnos = new Alumno[maxRegistro];
    int contador = 0;                             //Contador Registros
    SistemaNotas r = new SistemaNotas();

    public String generarReporteTodosExamenes() {
        String resultado = "";
        for (int i = 0; i < r.contador; i++) {
            if (r.examenes[i] != null) {
                resultado = resultado + r.examenes[i].getAlumno().toString();
                resultado = resultado + r.examenes[i].toString();
            }
        }
        return resultado;
    }

    
}
