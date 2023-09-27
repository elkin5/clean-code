package solid.inversion_dependencias;

public class Computadora {
    private Mouse mouse;
    private Teclado teclado;

    public Computadora() {
//         El modulo principal no debe depender de modulos secundarios
//        por lo tanto esta clase no debe de ser la encargada de crear los objetos
        this.teclado = new Teclado();
        this.mouse = new Mouse();
    }

    public void encender() {
        teclado.conectar();
        mouse.conectar();
    }
}
