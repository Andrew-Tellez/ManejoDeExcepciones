# Excepciones en java

Hola asesorados debido a que habia cierta confusion dentro
de las excepciones en java decidí hacer este repositorio
igualmente si tienen dudas pueden preguntar todos estamos aprendiendo.

Dentro de este repositorio se muestran las distintas excepciones
que podemos utilizar en java y que tenemos la posibildad
de crear nuestras propias excepciones a continuacion
les mostraremos las siguientes:

- Excepciones controladas
- Excepciones no controladas
- Errores

aqui se anexan varios ejemplos tipicos pero dentro del repositorio
hay excepciones con mas detalle les invito a checarlo.

## Excepcion Controlada

las excepciones controladas se utiliza un ***try-catch***
dentro de la funcion, en este caso *division*

~~~ java
  public void division(int a, int b) {
    try {
      int c = a / b;
      System.out.println("El resultado de la división es: " + c);
    } catch (ArithmeticException e) {
      System.err.println("Mensaje de error: " + e.getMessage() +
          "\nClase de la excepción: " + e.getClass() +
          "\nNo se puede dividir entre 0");
    }
  }
~~~

ahora dentro de las excepciones controladas
exiten otras que son mas *Explicitas* y *Personalizadas*
a continuacion vamos a tener la misma funcion *division*
solo que vamos añadir la palabra reservada ***throws*** y
***throw***

ejemplo:

- vamos a realizar una funcion que lanze una excepcion
si la variable a es igual a 10, si es diferente se retorna el numero

~~~ java
  public int NumeroDiez(int a) throws ExcepcionNumeroDiez {

    if (a == 10) {
      throw new ExcepcionNumeroDiez();
    }
    return a;

  }
~~~

Ahora se estaran preguntando ¿Donde esta *ExcepcionNumeroDiez*?, bueno tenemos que definirlo
para que pueda usarse

~~~ java
/**
 * ExcepcionNumeroDiez
 * Si es lanzada esta excepcion es porque el numero es 10
 */
public class ExcepcionNumeroDiez extends Exception {
  public ExcepcionNumeroDiez() {
    super("El número es 10");
  }
}
~~~

primero tenemos que definir la clase y hacer que herede de ***Exception***, luego poner el constructor llamando al constructor padre que recibe un parametro llamado ***message*** que es el texto **El numero es 10**

## Excepcion No Controlada

estos son errores que el compilador nos lanza por defecto si no realizamos ningun manejo de las excepciones aqui un ejemplo:

~~~ java
int a = 10 / 0;
~~~

esto provoca un error del tipo **AritmeticException** de forma automatica dentro de la compilacion

## Errores

Los errores son los que se producen en tiempo de ejecución y no se pueden manejar con try catch o throws los errores son los que se producen en el sistema operativo por ejemplo:

- cuando se intenta abrir un archivo que no existe o cuando se intenta abrir un archivo que no tiene permisos de lectura.

- errores de memoria como el StackOverflowError.

un ejemplo de StackOverflowError:

~~~ java
  public void recursividadInfinita() {
    System.out.println("Recursividad infinita");
    recursividadInfinita();
  }
~~~
