package solid.abierto_cerrado;

public class OperacionesMatematicasAvanzadas implements Operacion {
    private float a;
    private float b;

    public OperacionesMatematicasAvanzadas(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public float division() {
        return a/b;
    }

    @Override
    public String mostrar() {
        return String.format(
                "%1$f / %2$f = %3$f %n", this.a, this.b, this.division());
    }
}
