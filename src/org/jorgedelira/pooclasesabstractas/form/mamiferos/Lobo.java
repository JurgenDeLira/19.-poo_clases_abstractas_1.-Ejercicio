package org.jorgedelira.pooclasesabstractas.form.mamiferos;

public class Lobo extends Canino{
    private int camada;
    private String especieLobo;

    public Lobo(int camada, String especieLobo, String habitat, String nombreCientifico, Float altura, Float largo, Float peso, String color, float tamanoColmillos) {
        super(habitat, nombreCientifico, altura, largo, peso, color, tamanoColmillos);
        this.camada = camada;
        this.especieLobo = especieLobo;
    }

    public int getCamada() {
        return camada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El tamaño de los colmillos de los lobos de " +tamanoColmillos+ " cm les permite devorar fácilmente a sus presas";
    }

    @Override
    public String dormir() {
        return "Los " + nombreCientifico + " suelen dormir 8 horas";
    }

    @Override
    public String correr() {
        return "El peso común de los lobos de " + peso + " kilos les permite ser rápidos";
    }

    @Override
    public String comunicarse() {
        return "El habitat " +habitat+ "del lobo es estar en una camada que oscile entre los " + camada + " lobos";
    }
}
