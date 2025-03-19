package org.jorgedelira.pooclasesabstractas.form.mamiferos;

public class Guepardo extends Felino{

    public Guepardo(String habitat, String nombreCientifico, Float altura, Float largo, Float peso, float garras, int velocidad) {
        super(habitat, nombreCientifico, altura, largo, peso, garras, velocidad);
    }


    @Override
    public String comer() {
        return "El peso del alimento de un guepardo, oscila entre los " + peso + " kilos";
    }

    @Override
    public String dormir() {
        return "El habitat " + habitat + " de un guepardo es de dormir 8 horas";
    }

    @Override
    public String correr() {
        return "La altura promedio del guepardo de " + altura + " metros, le permite ser un animal ágil";
    }

    @Override
    public String comunicarse() {
        return "Su nombre cientifico es " + nombreCientifico + " y por lo regular son muy comunicativos entre sus especies";
    }
}
