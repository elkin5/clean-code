package solid.inversion_dependencias;

public class Mouse2 implements IMouse{
    @Override
    public void conectar() {
        System.out.println("Mouse conectado");
    }
}
