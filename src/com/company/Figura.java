package com.company;

/**
 * Created by sati on 26/08/2015.
 */
public class Figura {

    private String color;
    private boolean rellena;

    public Figura() {
        color = "rojo";
        rellena = true;
    }

    public Figura(String color, boolean rellena) {
        this.color = color;
        this.rellena = rellena;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRellena(boolean rellena) {
        this.rellena = rellena;
    }

    public String getColor() {
        return color;
    }

    public boolean isRellena() {
        return rellena;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "color='" + color + '\'' +
                ", rellena=" + rellena +
                '}';
    }
}
