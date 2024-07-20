public class Animales {
    private String nombre;

    public Animales(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}
