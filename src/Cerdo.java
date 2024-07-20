public class Cerdo extends Animales {
    public Cerdo(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: Oink");
    }
}
