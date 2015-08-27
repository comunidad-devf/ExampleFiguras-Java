package com.company;

/**
 * Created by sati on 26/08/2015.
 */
public class Rectangulo extends Figura implements Propiedades {

    private double ancho;
    private double alto;

    public Rectangulo() {
        this.ancho = 1.0;
        this.alto = 1.0;
    }

    public Rectangulo(String color, boolean rellena, double ancho, double alto) {
        super(color, rellena);
        this.ancho = ancho;
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    @Override
    public double getPerimetro() {
        return 2 * alto + 2 * ancho;
    }

    @Override
    public double getArea() {
        return alto * ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", "+super.toString()+
                '}';
    }
}
