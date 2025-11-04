/**
 * Clase que representa una multiplicación de dos expresiones
 * Esta es una NonTerminalExpression del patrón Interpreter
 *
 * Demuestra la extensibilidad del patrón: agregar nuevas operaciones
 * es tan simple como crear una nueva clase
 */
public class Multiplicacion extends Expresion {
    private Expresion izquierda;
    private Expresion derecha;

    public Multiplicacion(Expresion izquierda, Expresion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    @Override
    public int interpretar() {
        int resultadoIzquierda = izquierda.interpretar();
        int resultadoDerecha = derecha.interpretar();
        return resultadoIzquierda * resultadoDerecha;
    }
}
