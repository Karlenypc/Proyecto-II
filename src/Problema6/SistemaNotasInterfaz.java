package Problema6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Karlenypc
 */
public class SistemaNotasInterfaz {

    SistemaNotasReporte sistema = new SistemaNotasReporte();
    PadreFamiliar p;
    PadreFamiliar m;
    Alumno a;
    Examen e;

    public SistemaNotasInterfaz(SistemaNotasReporte s, PadreFamiliar p, PadreFamiliar m, Alumno a, Examen e) {
        this.sistema = s;
        this.p = p;
        this.m = m;
        this.a = a;
        this.e = e;
    }

    public int getModo() {

        int selecion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el modo: \n 1. Interactivo\n 2. Grafico"));
        if (selecion < 1 || selecion > 2) {
            JOptionPane.showMessageDialog(null, "Seleccion invalida.");
        }
        return selecion;
    }

//Modo Interactivo
    Scanner input = new Scanner(System.in);

    public int getOpcionMenu() {
        int menu = 0;
        System.out.println("Bienvenido por favor seleccione la opción que desea realizar: ");
        System.out.println("1) Agregar nota. ");
        System.out.println("2) Agregar información familiar. ");
        System.out.println("3) Eliminar nota. ");
        System.out.println("4) Mostrar datos registrados. ");
        System.out.println("5) Salir. ");
        menu = input.nextInt();
        if (menu < 1 || menu > 5) {
            System.out.println("Seleccion no valida.");
        }
        return menu;
    }

    public int getOpcionRegistro() {
        int opcion = 0;
        System.out.println("1. Generar reporte de examenes.");
        System.out.println("2. Generar reporte de alumnos");
        System.out.println("3. Generar reporte de alumnos con notas inferior a lo establecido.");
        System.out.println("4. Generar reporte de examenes ordenados por nota mayor.");
        opcion = input.nextInt();
        return opcion;
    }

    public void leaInformacionAlumno() {
        a = new Alumno();
        System.out.print("Digite el nombre del alumno:");
        a.setNombre(input.next());
        System.out.print("Digite el apellido:");
        a.setApellido(input.next());
        System.out.print("Digite el carne:");
        a.setCarnet(input.nextInt());
    }

    public void leaInformacionExamen() {
        e = new Examen();
        System.out.print("Digite los puntos totales del parcial:");
        e.setPuntosTotal(input.nextInt());
        System.out.print("Digite los puntos obtenidos:");
        e.setPuntosObtenidos(input.nextInt());
        System.out.print("Digite la nota obtenida:");
        e.setNota(input.nextInt());
        e.setAlumno(a);
        sistema.agregarEx(e);
    }

    public void leaInformacionFamiliar() {
        p = new PadreFamiliar();
        System.out.print("Digite el nombre del Padre: ");
        p.setNombre(input.next());
        System.out.print("Digite el apellido: ");
        p.setApellido(input.next());
        a.setPadre(p);
        m = new PadreFamiliar();
        System.out.print("Digite el nombre de la Madre: ");
        m.setNombre(input.next());
        System.out.print("Digite el apellido: ");
        m.setApellido(input.next());
        a.setMadre(m);
    }

    public void exceptionEliminar() {
        if (sistema.contador == 0) {
            System.out.println("No existen notas registradas.");
        } else {
            sistema.eliminarEx();
            System.out.println("La nota anterior ha sido eliminada con exito!");
        }
    }

    public void getReporteExamenes() {
        if (sistema.contador != 0) {
            System.out.println(sistema.generarReporteTodosExamenes());
        } else {
            System.out.println("No existen registros en el sistema.\n");
        }
    }

    public void getReporteAlumnos() {
        if (sistema.contador != 0) {
            System.out.println(sistema.generarReporteTodosAlumnos());
        } else {
            System.out.println("No existen registros en el sistema.\n");
        }
    }

    public void getReporteAlumnosNotaInferior() {
        if (sistema.contador != 0) {
        System.out.println(sistema.generarReporteTodosAlumnosNotaInferiorA(e.getNota()));
        } else {
            System.out.println("No existen registros en el sistema.\n");
        }
    }

    public void getReporteExamenesOrdenadosPor() {
        if (sistema.contador != 0) {
        System.out.println(sistema.generarReporteExamenesOrdenadosPor(e.getNota()));
        } else {
            System.out.println("No existen registros en el sistema.\n");
        }
    }

//Modo grafico 
    public int getOpcionMenuJ() {
        int menu = 0;
        menu = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido por favor seleccione la opción que desea realizar:\n "
                + "1) Agregar nota.\n 2) Agregar información familiar.\n "
                + "3) Eliminar nota.\n 4) Mostrar datos registrados.\n 5) Salir. "));
        if (menu < 1 || menu > 5) {
            JOptionPane.showMessageDialog(null, "Seleccion no valida.");
        }
        return menu;
    }

    public void introduzcaInfoAlumno() {
        String nombre = JOptionPane.showInputDialog("Digite el nombre: ");
        String apellido = JOptionPane.showInputDialog("Digite el apellido: ");
        int carne = Integer.parseInt(JOptionPane.showInputDialog("Digite el carne: "));
        a = new Alumno(nombre, apellido, carne);
    }

    public void introduzcaInfoExamen() {
        e = new Examen();
        e.setPuntosTotal(Integer.parseInt(JOptionPane.showInputDialog("Digite los puntos totales del parcial: ")));
        e.setPuntosObtenidos(Integer.parseInt(JOptionPane.showInputDialog("Digite los puntos obtenidos: ")));
        e.setNota(Integer.parseInt(JOptionPane.showInputDialog("Digite la nota obtenida: ")));
        e.setAlumno(a);
        sistema.agregarEx(e);
    }

    public void introduzcaInfoFamiliar() {
        p = new PadreFamiliar();
        p.setNombre(JOptionPane.showInputDialog("Digite el nombre del Padre: "));
        p.setApellido(JOptionPane.showInputDialog("Digite el apellido: "));
        a.setPadre(p);
        m = new PadreFamiliar();
        m.setNombre(JOptionPane.showInputDialog("Digite el nombre de la Madre: "));
        m.setApellido(JOptionPane.showInputDialog("Digite el apellido: "));
        a.setMadre(m);
    }

    public void exceptionEliminarJ() {
        if (sistema.contador == 0) {
            JOptionPane.showMessageDialog(null, "No existen notas registradas.");
        } else {
            sistema.eliminarEx();
            JOptionPane.showMessageDialog(null, "La nota anterior ha sido eliminada con exito!");
        }
    }
    
    
}
