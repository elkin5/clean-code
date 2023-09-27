package solid.sustitucion_liskov;

/*
Debe ser posible definir un objeto a partir de su interfaz como de la implementación.
Es posible definirse un objeto a partir de una clase padre y deben poder ejecutarse todos los métodos de la clase padre.
No se debe sacrificar comportamiento en cada herencia se debe de mantener
 */
public class Main {
    public static void main(String[] args) {
        Jaguar jaguar = new Jaguar();
        jaguar.caza();
        jaguar.ruge();
        jaguar.come();
        jaguar.maulla();
//        El jaguar no maulla por lo tanto no podriamos decir que se puede definir completamente el jaguar a partir
//        de sus clases padres sin sacrificar funcionalidades
    }
}
