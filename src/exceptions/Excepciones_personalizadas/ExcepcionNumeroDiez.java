package exceptions.Excepciones_personalizadas;

/**
 * ExcepcionNumeroDiez
 * Si es lanzada esta excepcion es porque el numero es 10
 */
public class ExcepcionNumeroDiez extends Exception {
  public ExcepcionNumeroDiez() {
    super("El número es 10");
  }
}
