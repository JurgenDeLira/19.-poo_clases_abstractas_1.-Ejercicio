package org.jorgedelira.pooclasesabstractas.form.mamiferos;

abstract public class Felino extends Mamifero{
    protected float garras;
    protected int velocidad;

    public Felino(String habitat, String nombreCientifico, Float altura, Float largo, Float peso, float garras, int velocidad) {
        super(habitat, nombreCientifico, altura, largo, peso);
        this.garras = garras;
        this.velocidad = velocidad;
    }

    public float getGarras() {
        return garras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
