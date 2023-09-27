package solid.inversion_dependencias;

public class Teclado2 implements ITeclado{
    @Override
    public void conectar() {
        System.out.println("Teclado conectado");
    }
}
