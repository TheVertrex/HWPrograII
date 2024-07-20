public class Caballo extends Animales {
    public Caballo(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: Hiiii");
    }
}
