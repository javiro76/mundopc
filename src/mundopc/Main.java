package mundopc;

import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;

public class Main {
    public static void main(String[] args) {

       //creado objetos
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
        System.out.println(ratonLenovo);

        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        System.out.println(tecladoLenovo);

        Monitor monitorLenovo = new Monitor("Lenovo", 32);
        System.out.println(monitorLenovo);

    }
}