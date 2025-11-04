/**
 * Clase que representa una resta de dos expresiones
 * Esta es una NonTerminalExpression del patrón Interpreter
 *
 * Funciona de manera similar a Suma, pero realiza una resta
 * en lugar de una suma
 */
public class Resta extends Expresion {
    private Expresion izquierda;
    private Expresion derecha;

    public Resta(Expresion izquierda, Expresion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    @Override
    public int interpretar() {
        int resultadoIzquierda = izquierda.interpretar();
        int resultadoDerecha = derecha.interpretar();
        return resultadoIzquierda - resultadoDerecha;
    }
}
