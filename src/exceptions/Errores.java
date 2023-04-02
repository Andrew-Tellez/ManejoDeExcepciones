package exceptions;

public class Errores {
  // aqui se encuentran los errores que se pueden producir en tiempo de ejecución

  // Error de StackOverflowError
  // este error se produce cuando se produce una recursividad infinita
  // es decir cuando una función se llama a si misma infinitamente
  // por ejemplo:
  public void recursividadInfinita() {
    System.out.println("Recursividad infinita");
    recursividadInfinita();
  }
  // esto creara un desbordamiento de pila

}
