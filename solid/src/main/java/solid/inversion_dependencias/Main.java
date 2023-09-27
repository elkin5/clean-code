package solid.inversion_dependencias;

/*
Las entidades deben depender de abstracciones y no de concreciones (depender de interfaces)
Un modulo de alto nivel no debe depender de un modulo de bajo nivel si no de abstracciones
 (un constructor no debe tener un new )
 */
public class Main {
    public static void main(String[] args) {
        // Tiene problemas de responsabilidad simple
        // Abierto cerrado
        // Segregacion de interfaz
        // Inversion de dependencias
        System.out.println("PC 1");
        Computadora pc = new Computadora();
        pc.encender();

        // Se solucionan los problemas
        System.out.println("PC 2");
        IMouse mouse = new Mouse2();
        ITeclado teclado = new Teclado2();
        Computadora2 pc2 = new Computadora2(teclado, mouse);
        pc2.encender();
    }
}
