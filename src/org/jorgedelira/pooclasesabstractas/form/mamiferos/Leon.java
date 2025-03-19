package org.jorgedelira.pooclasesabstractas.form.mamiferos;

public class Leon extends Felino{
    private int manada;
    private double potenciaRugido;

    public Leon(int manada, double potenciaRugido, String habitat, String nombreCientifico, Float altura, Float largo, Float peso, float garras, int velocidad) {
        super(habitat, nombreCientifico, altura, largo, peso, garras, velocidad);
        this.manada = manada;
        this.potenciaRugido = potenciaRugido;
    }

    public int getManada() {
        return manada;
    }

    public double getPotenciaRugido() {
        return potenciaRugido;
    }

    @Override
    public String comer() {
        return "El león caza junto a su grupo de " + manada + " individuos en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El León duerme en las estepas africanas";
    }

    @Override
    public String correr() {
        return "El león corre a " + velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El león ruge fuerte a " + potenciaRugido + "decibeles";
    }
}
