package exceptions;

import exceptions.Excepciones_personalizadas.ExcepcionNumeroDiez;
import exceptions.Excepciones_personalizadas.ExcepcionParImpar;
// aqui se encuentran las excepciones personalizadas
// usando la palabra reservada **throws** se puede personalizar una excepción

public class Explicitas {

  // vamos a crear una excepcion que verifique si el numero es par o impar
  // si el numero es par se lanzara una excepcion
  // si el numero es impar se mostrara el numero

  public void parImpar(int numero) throws ExcepcionParImpar {
    if (numero % 2 == 0) {
      throw new ExcepcionParImpar("El número es par");
    } else {
      System.out.println("El número es impar");
    }
  }

  // 1.1 Excepción de tipo ExcepcionNumeroDiez
  // vamos a crear una excepcion que verifique si el numero es 10
  // si el numero es 10 se lanzara una excepcion
  // si el numero es diferente de 10 se mostrara el numero
  public int NumeroDiez(int a) throws ExcepcionNumeroDiez {

    if (a == 10) {
      throw new ExcepcionNumeroDiez();
    }
    return a;

  }

}
