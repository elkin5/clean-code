package solid.segregacion_interface;

/*
Un cliente(implementación) no debe de ser forzado a implementar métodos que no usa
Las clases que implementan dichas interfaces deben asegurarse de usar todos lo métodos definidos
Si esto no ocurre debemos sacar pequeñas interfaces
Las clases hijas solo implementen los métodos que necesitan
Es necesario abstraer mas informacion
 */
public class Main {
    public static void main(String[] args) {
        Jaguar2 jaguar = new Jaguar2();
        jaguar.caza();
        jaguar.ruge();
        jaguar.come();

//        Ademas se soluciona el problema del principio de liskov ya que es posible
//        crear un objeto desde su padre y abuelo sin perder funcionalidad
        IFelinoSalvaje jaguar2 = new Jaguar2();
        jaguar2.caza();
        jaguar2.ruge();

        IFelino2 jaguar3 = new Jaguar2();
        jaguar3.caza();
    }
}
