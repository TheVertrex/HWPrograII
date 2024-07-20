public class Main {
    public static void main(String[] args) {
        System.out.println("HOMEWORK #1");

        Animales[] animales = {
                new Gato("Gato"),
                new Perro("Perro"),
                new Vaca("Vaca"),
                new Caballo("Caballo"),
                new Oveja("Oveja"),
                new Cerdo("Cerdo"),
                new León("León"),
                new Elefante("Elefante"),
                new Lobo("Lobo"),
                new Pato("Pato")
        };

        for (Animales animal : animales) {
            animal.hacerSonido();
        }
    }
}
