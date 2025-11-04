/**
 * Clase que representa un número en la expresión
 * Esta es una TerminalExpression del patrón Interpreter
 *
 * Los números son expresiones terminales: no contienen otras expresiones
 * Solo tienen un valor que se retorna directamente
 */
public class Numero extends Expresion {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    @Override
    public int interpretar() {
        // Una expresión terminal simplemente retorna su valor
        return this.valor;
    }
}
