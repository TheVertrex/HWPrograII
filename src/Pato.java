public class Pato extends Animales {
    public Pato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: Cuac");
    }
}
