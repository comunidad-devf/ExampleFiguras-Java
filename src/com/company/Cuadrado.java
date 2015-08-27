package com.company;

/**
 * Created by sati on 26/08/2015.
 */
public class Cuadrado extends Rectangulo {

    public Cuadrado() {
    }

    public Cuadrado(String color, boolean rellena, double lado) {
        super(color, rellena, lado, lado);
    }

    public double getLado () {
        return super.getAlto();
    }

    public void setLado (double lado){
        super.setAlto(lado);
        super.setAncho(lado);
    }

    public String toString () {
        return super.toString();
    }


}
