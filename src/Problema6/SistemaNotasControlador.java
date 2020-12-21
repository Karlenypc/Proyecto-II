package Problema6;

/**
 *
 * @author Karlenypc
 */
public class SistemaNotasControlador {

    //Var Global
    int modo;

    public void iniciar() {
        SistemaNotasReporte s = new SistemaNotasReporte();
        PadreFamiliar p = new PadreFamiliar();
        PadreFamiliar m = new PadreFamiliar();
        Alumno a = new Alumno();
        Examen e = new Examen();
        SistemaNotasInterfaz vst = new SistemaNotasInterfaz(s, p, m, a, e);

        modo = vst.getModo();
        int menu = 0;
        do {
            if (modo == 1) {
                menu = vst.getOpcionMenu();
                switch (menu) {
                    case 1:
                        vst.leaInformacionAlumno();
                        vst.leaInformacionExamen();
                        break;
                    case 2:
                        vst.leaInformacionFamiliar();
                        break;
                    case 3:
                        vst.exceptionEliminar();
                        break;
                    case 4:
                        int seleccion = vst.getOpcionRegistro();
                        if (seleccion == 1)
                            vst.getReporteExamenes();
                        if (seleccion == 2)
                            vst.getReporteAlumnos();
                        if (seleccion == 3)
                            vst.getReporteAlumnosNotaInferior();
                        if (seleccion == 4) 
                            vst.getReporteExamenesOrdenadosPor();
                        break;
                }
            } else {
                menu = vst.getOpcionMenuJ();
                switch (menu) {
                    case 1:
                        vst.introduzcaInfoAlumno();
                        vst.introduzcaInfoExamen();
                        break;
                    case 2:
                        vst.introduzcaInfoFamiliar();
                        break;
                    case 3:
                        vst.exceptionEliminarJ();
                        break;
                    case 4:
                        
                        break;
                }
            }
        } while (menu < 5);
    }
}
