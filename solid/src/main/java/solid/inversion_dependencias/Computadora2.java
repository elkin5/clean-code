package solid.inversion_dependencias;

public class Computadora2 {
    private ITeclado teclado;
    private IMouse mouse;

    //    De esta manera implemantamos la inversion de control dado que no depende de concreciones si no de abstraciones
    public Computadora2(ITeclado teclado, IMouse mouse) {
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public void encender() {
        this.teclado.conectar();
        this.mouse.conectar();
    }
}
