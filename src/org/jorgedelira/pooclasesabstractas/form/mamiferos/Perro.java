package org.jorgedelira.pooclasesabstractas.form.mamiferos;

public class Perro extends Canino{
    private int fuerzaMordida;

    public Perro(int fuerzaMordida, String habitat, String nombreCientifico, Float altura, Float largo, Float peso, String color, float tamanoColmillos) {
        super(habitat, nombreCientifico, altura, largo, peso, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "Los perros con la fuerza de mordida de " + fuerzaMordida + " de fuerza, pueden morder algunos huesos";
    }

    @Override
    public String dormir() {
        return "Los perros suelen dormir 6 horas";
    }

    @Override
    public String correr() {
        return "A los perros de color " + color + " les gusta mucho correr";
    }

    @Override
    public String comunicarse() {
        return "Los perros olfatean entre ellos, comunmente los que miden " +altura+ " metros, conviven más con los de ese mismo largo de " + largo + " metros";
    }
}
