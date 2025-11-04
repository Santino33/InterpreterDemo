/**
 * Clase que representa una suma de dos expresiones
 * Esta es una NonTerminalExpression del patrón Interpreter
 *
 * Suma contiene dos otras expresiones (izquierda y derecha)
 * Para interpretar una suma, debe interpretar recursivamente ambas expresiones
 * y luego sumar los resultados
 */
public class Suma extends Expresion {
    private Expresion izquierda;
    private Expresion derecha;

    public Suma(Expresion izquierda, Expresion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    @Override
    public int interpretar() {
        // Una expresión no terminal interpreta sus sub-expresiones recursivamente
        int resultadoIzquierda = izquierda.interpretar();
        int resultadoDerecha = derecha.interpretar();
        return resultadoIzquierda + resultadoDerecha;
    }
}
