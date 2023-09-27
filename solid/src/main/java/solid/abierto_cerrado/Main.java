package solid.abierto_cerrado;

import java.time.LocalDate;

/*
Si queremos extender la aplicación debemos poder lograrlo agregando módulos sin modificar módulos ya desarrollados,
 para esto es importante el uso de las interfaces al momento de definir métodos susceptibles de recibir nuevos
  comportamiento, ejemplo la presentación de información no debe estar atado a un tipo especifico de dato si no
   a una interfaz
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        Operacion operacionesMatematicasBasicas = new OperacionesMatematicasBasicas(2, 5);
        Imprimir2 imprimir = new Imprimir2();
        imprimir.consola(operacionesMatematicasBasicas);
        Operacion operacionesMatematicasAvanzadas = new OperacionesMatematicasAvanzadas(2, 5);
        imprimir.consola(operacionesMatematicasAvanzadas);
    }
}
