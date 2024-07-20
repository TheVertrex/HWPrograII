public class Oveja extends Animales {
    public Oveja(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: Beeee");
    }
}
