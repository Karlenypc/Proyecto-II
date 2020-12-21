package Problema6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Karlenypc
 */
public class Ventana extends JFrame {

    public Ventana() {
        
        setTitle("Ventana PrincipaL");
        this.setSize(500, 500); //Establecemos el tamaño de la ventana
        setLocationRelativeTo(null); //Establecemos la ventana en el centro de la pantalla
        setMinimumSize(new Dimension(200, 200)); //Establecemos el tamaño minimo
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Permite terminar la ejecucion del programa al presionar EXIT

        iniciarComponentes();
    }
    
    private void iniciarComponentes() {
        JPanel panel = new JPanel(); //Creacion de un panel
        //panel.setBackground(Color.WHITE);
        panel.setLayout(null); //Desactivar el layout por default
        this.getContentPane().add(panel); //Agregamos el panel a la ventana
        
        JLabel etiqueta = new JLabel("Hola"); //Creamos una etiqueta
        
        etiqueta.setForeground(Color.BLACK); //Establecemos el color de la letra 
        etiqueta.setOpaque(true); //Establecemos permiso para pintar el fondo de la etiqueta
        etiqueta.setBackground(Color.WHITE); //Establecemos color de fondo de la etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //Establecemos posicion horizontal del texto
        etiqueta.setFont(new Font("arial", Font.PLAIN, 10)); //Establecemos la fuente del texto
        
        panel.add(etiqueta); //Agregamos la etiqueta al panel
        
    }
}
