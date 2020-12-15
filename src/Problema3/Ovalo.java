/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema3;

/**
 *
 * @author Karlenypc
 */
public class Ovalo {
    
    int posEjeX;
    int posEjeY;
    int ancho;
    int alto;

    public Ovalo() {
    }
    
    public Ovalo(int posEjeX, int posEjeY, int ancho, int alto) {
        this.posEjeX = posEjeX;
        this.posEjeY = posEjeY;
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getPosEjeX() {
        return posEjeX;
    }

    public void setPosEjeX(int posEjeX) {
        this.posEjeX = posEjeX;
    }

    public int getPosEjeY() {
        return posEjeY;
    }

    public void setPosEjeY(int posEjeY) {
        this.posEjeY = posEjeY;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
}
