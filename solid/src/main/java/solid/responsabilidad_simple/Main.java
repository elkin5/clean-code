package solid.responsabilidad_simple;

/*
Una clase debe de tener una alta cohesión ósea una alta interacción consigo misma,
por lo tanto este principio indica que una clase debe encargarse de simplemente de
"sus cosas", por ejemplo si es una clase que realiza operaciones matemáticas no debe
preocuparse por como se muestra la información de esas operaciones matemáticas.
 */
public class Main {
    public static void main(String[] args) {
        OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas(2, 5);
        Imprimir imprimir = new Imprimir();
        imprimir.consola(operacionesMatematicas);
    }
}
