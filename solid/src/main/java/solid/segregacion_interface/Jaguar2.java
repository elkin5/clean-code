package solid.segregacion_interface;

import solid.sustitucion_liskov.Animal;

public class Jaguar2 extends Animal implements IFelinoSalvaje {
    @Override
    public void caza() {
        System.out.println("El jaguar Caza");
    }

    @Override
    public void ruge() {
        System.out.println("El jaguar Ruge");
    }
}
