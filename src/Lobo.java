public class Lobo extends Animales {
    public Lobo(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: Auuuu");
    }
}
