package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class Main {
    public static void main(String[] args) {

       //creado objetos
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
        System.out.println(ratonLenovo);

        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        System.out.println(tecladoLenovo);

        Monitor monitorLenovo = new Monitor("Lenovo", 32);
        System.out.println(monitorLenovo);

        Computadora computadoraLenovo = new Computadora("Computadora Lenovo",monitorLenovo,tecladoLenovo,ratonLenovo);
        System.out.println(computadoraLenovo);

        //creando orden
        Orden orden_1 = new Orden();
        orden_1.agregarComputadora(computadoraLenovo);
        orden_1.mostarOrden();

    }
}