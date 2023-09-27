package solid.responsabilidad_simple;

/*
Solo se encarga de las operaciones matematicas
 */
public class OperacionesMatematicas {

    private int a;
    private int b;

    public OperacionesMatematicas(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int suma() {
        return a + b;
    }

    public int multiplicacion() {
        return a * b;
    }

    @Override
    public String toString() {
        return String.format(
                "%1$d + %2$d = %3$d %n%1$d x %2$d = %4$d %n", this.a, this.b, this.suma(), this.multiplicacion());
    }
}
