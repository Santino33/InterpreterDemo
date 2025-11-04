/**
 * Clase abstracta que define la interfaz común para todas las expresiones
 * Esta es la AbstractExpression del patrón Interpreter
 *
 * Todas las expresiones (números, operaciones) heredan de esta clase
 * y deben implementar el método interpretar()
 */
public abstract class Expresion {
    /**
     * Método que evalúa/interpreta la expresión
     * @return el resultado de evaluar esta expresión
     */
    public abstract int interpretar();
}
