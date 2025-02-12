package mundopc.modelo;

public class Computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorCompudatoras;

    public Computadora() {
        this.idComputadora = ++contadorCompudatoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                " \n idComputadora=" + idComputadora +
                ",\n nombre='" + nombre + '\'' +
                ",\n monitor=" + monitor +
                ",\n teclado=" + teclado +
                ",\n raton=" + raton +
                '}';
    }
}
