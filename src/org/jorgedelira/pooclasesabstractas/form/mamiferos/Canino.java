package org.jorgedelira.pooclasesabstractas.form.mamiferos;

abstract public class Canino extends Mamifero{
    protected String color;
    protected float tamanoColmillos;

    public Canino(String habitat, String nombreCientifico, Float altura, Float largo, Float peso, String color, float tamanoColmillos) {
        super(habitat, nombreCientifico, altura, largo, peso);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }
}
