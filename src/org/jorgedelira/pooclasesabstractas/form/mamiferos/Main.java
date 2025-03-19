package org.jorgedelira.pooclasesabstractas.form.mamiferos;

public class Main {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];

        Mamifero leon = new Leon(10, 5, "natural", "Panthera leo", 1.2f, 2.0f, 190.0f, 5, 60);
        Mamifero tigre = new Tigre("Felino", "natural", "Tigrus agilus", 2.0f, 3.0f, 100f, 5, 90);
        Mamifero lobo = new Lobo(10, "Lobo depredador", "natural", "Lobus Lotus", 1.5f, 1.6f, 90f, "Negro", 5);
        Mamifero perro = new Perro(1, "natural", "Perrus wawo", 1.1f, 1.2f, 30f, "beige", 3);
        Mamifero guepardo = new Guepardo("natural", "Guepardus wolverinus", 2.0f, 2.3f, 130f, 5, 120);

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = lobo;
        mamiferos[3] = perro;
        mamiferos[4] = guepardo;

        for (Mamifero animal : mamiferos) {

            System.out.println(" ================ " + animal.getClass().getSimpleName() + " ================= ");
            System.out.println("Habitat: " + animal.getHabitat());
            System.out.println("Altura: " + animal.getAltura());
            System.out.println("Largo: " + animal.getLargo());
            System.out.println("Peso: " + animal.getPeso());

            if (animal instanceof Canino){
                System.out.println("Colmillos: " + ((Canino) animal).getTamanoColmillos());
                System.out.println("Color: " + ((Canino)animal).getColor());

                if (animal instanceof Lobo) {
                    System.out.println("Especie Lobo: " + ((Lobo)animal).getEspecieLobo());
                    System.out.println("Número integrantes: " + ((Lobo)animal).getCamada());
                }
                if (animal instanceof Perro) {
                    System.out.println("Fuerza mordida kg: " + ((Perro)animal).getFuerzaMordida());
                }
            }

            if (animal instanceof Felino) {
                System.out.println("Velocidad: " + ((Felino)animal).getVelocidad());
                System.out.println("Garras: " + ((Felino)animal).getGarras());

                if (animal instanceof Tigre) {
                    System.out.println("Especie: " + ((Tigre)animal).getEspecie());
                }
                if (animal instanceof Leon) {
                    System.out.println("Manada: " + ((Leon)animal).getManada());
                    System.out.println("Potencia del rugido: " + ((Leon)animal).getPotenciaRugido());
                }
            }

            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());

        }
    }
}
