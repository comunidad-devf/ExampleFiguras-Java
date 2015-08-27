package com.company;

/**
 * Created by sati on 26/08/2015.
 */
public class Circulo extends Figura implements Propiedades {

    private double radio;

    public Circulo() {
        radio = 1.0;
    }

    public Circulo(String color, boolean rellena, double radio) {
        super(color, rellena);
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }


    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio
                + super.toString() +
                '}';
    }
}
