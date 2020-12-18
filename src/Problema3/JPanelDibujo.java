package Problema3;

/**
 *
 * @author Karlenypc
 */
import javax.swing.*;
import java.awt.*;

public class JPanelDibujo extends JPanel {

    /* 
     * Constructor del panel para dibujar
     */
    public JPanelDibujo() {
        this.setBackground(Color.GREEN);
    }

    // Reimplementa paint
    public void paint(Graphics g) {
        super.paint(g);

        //LINEAS
        g.drawLine(25, 90, 60, 50); //dibuja una línea

        for (int i = 0; i < 3; i++) {
            int[] arreglo = new int[8];
            for (int j = 0; j < arreglo.length; j++) {
                arreglo[j] = (int) (Math.random() * 500);
            }

            //OVALOS
            Ovalo ov = new Ovalo(arreglo[0], arreglo[1], arreglo[2], arreglo[3]);
            g.setColor(Color.cyan);
            g.fillOval(ov.getPosEjeX(), ov.getPosEjeY(), ov.getAncho(), ov.getAlto());  //dibuja un ovalo con fondo aqua

            //RECTANGULOS
            Rectangulo rtg = new Rectangulo(arreglo[4], arreglo[5], arreglo[6], arreglo[7]);
            g.setColor(Color.black);
            g.drawRect(rtg.getPosEjeX(), rtg.getPosEjeY(), rtg.getAncho(), rtg.getAlto()); //dibuja un rectangulo sin fondo
        }

        g.clearRect(800, 160, 50, 70);//note lo que pasa si comenta esta línea

        // STRINGS
        Font fuente = new Font("Arial", Font.BOLD, 15);
        g.setColor(Color.blue);
        g.setFont(fuente);
        g.drawString("Hola mundo!", 5, 360);

        // ARCOS
        g.setColor(Color.yellow);
        g.fillArc(240, 340, 100, 100, 25, 300);
        g.setColor(Color.white);
        g.fillArc(240, 340, 100, 100, 15, 10);
        g.fillArc(240, 340, 100, 100, 325, 10);

        // POLIGONOS
        Polygon estrella = new Polygon();
        // Este no es estrella
        int cX[] = {420, 440, 460, 480, 500, 420, 420}; // Coordenada x de los puntos del polígono
        int cY[] = {470, 430, 450, 430, 490, 490, 470}; // Coordenada y de los puntos del polígono

        estrella.addPoint(510, 355);
        estrella.addPoint(590, 355);
        estrella.addPoint(525, 415);
        estrella.addPoint(550, 330);
        estrella.addPoint(580, 415);

        g.setColor(Color.red);
        g.drawPolygon(estrella);
        g.setColor(Color.blue);
        g.fillPolygon(cX, cY, cX.length);

    }

}
