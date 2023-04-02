import static java.lang.System.out;
import static java.lang.System.err;
import exceptions.Controladas;
// import exceptions.Errores;
import exceptions.Explicitas;
import exceptions.Excepciones_personalizadas.ExcepcionNumeroDiez;

// Esta es la clase principal de la aplicación en la cual se ubica el método main
// los distintos tipos de excepciones se encuentran en la carpeta src/exceptions

// dentro de src/exceptions se encuentran clases que contienen los distintos tipos de excepciones
// que luego son utilizadas en el archivo src/exceptions/Personalizadas.java

/*
 * Aqui se encuentra un listado de las excepciones que se pueden utilizar en Java
 * Excepciones controladas
 * Escepciones no controladas
 * Errores
 */
public class App {

    public static void main(String[] args) {
        // las controladas y las explicitas son lo mismo
        // la diferencia es que las controladas son las que se manejan con try catch
        // y las explicitas son las que se manejan con throws
        Controladas controladas = new Controladas();
        Explicitas explicitas = new Explicitas();
        // Errores errores = new Errores();
        controladas.division(10, 0);

        try {
            out.println(explicitas.NumeroDiez(10));
        } catch (ExcepcionNumeroDiez e) {
            err.println("Mensaje de error: " + e.getMessage() + "\n");
        }

        // No controladas
        // No controladas son las que no se manejan con try catch o throws
        int a = 10 / 0; // <----- Excepción no controlada de tipo ArithmeticException
        // esta la dispara el compilador porque no se puede dividir entre 0

        // Errores
        // StackOverflowError
        // errores.recursividadInfinita();

    }
}
