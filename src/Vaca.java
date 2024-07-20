public class Vaca extends Animales {
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: Muuu");
    }
}
