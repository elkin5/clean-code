package solid.sustitucion_liskov;

public class Jaguar extends Animal implements IFelino {

    @Override
    public void ruge() {
        System.out.println("El Jaguar Ruge");
    }

    @Override
    public void caza() {
        System.out.println("El jaguar Caza");
    }

    @Override
    public void maulla() {
        throw new IllegalCallerException("EL Jaguar no maulla");
    }
}
