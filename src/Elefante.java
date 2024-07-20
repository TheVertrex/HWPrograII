public class Elefante extends Animales {
    public Elefante(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: Trumpet");
    }
}
