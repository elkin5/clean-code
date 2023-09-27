package solid.abierto_cerrado;

public class OperacionesMatematicasBasicas implements Operacion {
    private int a;
    private int b;

    public OperacionesMatematicasBasicas(int a, int b) {
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
    public String mostrar() {
        return String.format(
                "%1$d + %2$d = %3$d %n%1$d x %2$d = %4$d %n", this.a, this.b, this.suma(), this.multiplicacion());
    }
}
