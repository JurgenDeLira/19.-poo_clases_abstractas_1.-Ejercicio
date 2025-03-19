package org.jorgedelira.pooclasesabstractas.form.mamiferos;

public class Tigre extends Felino{
    private String especie;

    public Tigre(String especie, String habitat, String nombreCientifico, Float altura, Float largo, Float peso, float garras, int velocidad) {
        super(habitat, nombreCientifico, altura, largo, peso, garras, velocidad);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public String comer() {
        return "El tigre al deborar a sus presas puede utilizar sus " + garras + " garras, adicional a sus colmillos";
    }

    @Override
    public String dormir() {
        return "debido al peso común de " + peso + " kilos, los tigres deben de dormir varias horas";
    }

    @Override
    public String correr() {
        return "La especie de tigre"+ especie + " le permite alcanzar unas velocidades de" + velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El habitat " + habitat + " de los tigres bebes, es estando siempre al cuidado de la madre";
    }
}
