package exceptions;

// Excepciones controladas
public class Controladas {
  // vamos a mostrar distintos casos de excepciones controladas

  // 1. Excepción de tipo ArithmeticException
  public void division(int a, int b) {
    try {
      int c = a / b;
      System.out.println("El resultado de la división es: " + c);
    } catch (ArithmeticException e) {
      System.err.println("Mensaje de error: " + e.getMessage() +
          "\nClase de la excepción: " + e.getClass() +
          "\nNo se puede dividir entre 0\n");
    }
  }

  // 2. Excepción de tipo ArrayIndexOutOfBoundsException
  public void array(int[] array) {
    try {
      System.out.println(array[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("El índice del array no existe");
    }
  }

  // 3. Excepción de tipo NumberFormatException
  public void number(String numero) {
    try {
      int num = Integer.parseInt(numero);
      System.out.println("El número es: " + num);
    } catch (NumberFormatException e) {
      System.out.println("El valor no es un número");
    }
  }

  // 4. Excepción de tipo NullPointerException
  public void nulo(String cadena) {
    try {
      System.out.println(cadena.length());
    } catch (NullPointerException e) {
      System.out.println("La cadena es nula");
    }
  }

  // 5. Excepción de tipo StringIndexOutOfBoundsException
  public void string(String cadena) {
    try {
      System.out.println(cadena.charAt(5));
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("El índice de la cadena no existe");
    }
  }

  // 6. Excepción de tipo ClassCastException
  public void cast(Object objeto) {
    try {
      String cadena = (String) objeto;
      System.out.println(cadena);
    } catch (ClassCastException e) {
      System.out.println("El objeto no es una cadena");
    }
  }

  // 7. Excepción de tipo IllegalArgumentException
  public void argumento(int numero) {
    try {
      if (numero < 0) {
        throw new IllegalArgumentException("El número no puede ser negativo");
      }
      System.out.println("El número es: " + numero);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  // 8. Excepción de tipo IllegalStateException
  public void estado() {
    try {
      throw new IllegalStateException("El estado no es válido");
    } catch (IllegalStateException e) {
      System.out.println(e.getMessage());
    }
  }

  // 9. Excepción de tipo IndexOutOfBoundsException
  public void indice(int[] array) {
    try {
      System.out.println(array[5]);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("El índice del array no existe");
    }
  }

  // 10. Excepción de tipo NegativeArraySizeException
  public void negativo(int numero) {
    try {
      int[] array = new int[numero];
      System.out.println(array);
    } catch (NegativeArraySizeException e) {
      System.out.println("El tamaño del array no puede ser negativo");
    }
  }
}
