//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * Aplicación que demuestra el uso del patrón Interpreter
 * Crea árboles de expresiones y las interpreta (evalúa)
 */
public class InterpretadorApp {

    public static void main(String[] args) {
        System.out.println("========== INTÉRPRETE DE EXPRESIONES ARITMÉTICAS ==========\n");

        // EJEMPLO 1: Expresión simple
        // Construcción: 5
        System.out.println("--- EJEMPLO 1: Número Simple ---");
        Expresion expresion1 = new Numero(5);
        System.out.println("Expresión: 5");
        System.out.println("Resultado: " + expresion1.interpretar());
        System.out.println();

        // EJEMPLO 2: Suma simple
        // Construcción: 3 + 2
        System.out.println("--- EJEMPLO 2: Suma Simple ---");
        Expresion expresion2 = new Suma(
                new Numero(3),
                new Numero(2)
        );
        System.out.println("Expresión: 3 + 2");
        System.out.println("Resultado: " + expresion2.interpretar());
        System.out.println();

        // EJEMPLO 3: Resta simple
        // Construcción: 10 - 4
        System.out.println("--- EJEMPLO 3: Resta Simple ---");
        Expresion expresion3 = new Resta(
                new Numero(10),
                new Numero(4)
        );
        System.out.println("Expresión: 10 - 4");
        System.out.println("Resultado: " + expresion3.interpretar());
        System.out.println();

        // EJEMPLO 4: Multiplicación
        // Construcción: 6 * 7
        System.out.println("--- EJEMPLO 4: Multiplicación ---");
        Expresion expresion4 = new Multiplicacion(
                new Numero(6),
                new Numero(7)
        );
        System.out.println("Expresión: 6 * 7");
        System.out.println("Resultado: " + expresion4.interpretar());
        System.out.println();

        // EJEMPLO 5: Expresión compleja anidada
        // Construcción: (5 + 3) * 2
        // Esto demuestra la composición y recursividad del patrón
        System.out.println("--- EJEMPLO 5: Expresión Compleja Anidada ---");
        Expresion expresion5 = new Multiplicacion(
                new Suma(
                        new Numero(5),
                        new Numero(3)
                ),
                new Numero(2)
        );
        System.out.println("Expresión: (5 + 3) * 2");
        System.out.println("Resultado: " + expresion5.interpretar());
        System.out.println("Explicación del cálculo:");
        System.out.println("  1. Suma: 5 + 3 = 8");
        System.out.println("  2. Multiplicación: 8 * 2 = 16");
        System.out.println();

        // EJEMPLO 6: Expresión muy compleja
        // Construcción: ((10 - 2) * 3) + (4 * 5)
        System.out.println("--- EJEMPLO 6: Expresión Muy Compleja ---");
        Expresion expresion6 = new Suma(
                new Multiplicacion(
                        new Resta(
                                new Numero(10),
                                new Numero(2)
                        ),
                        new Numero(3)
                ),
                new Multiplicacion(
                        new Numero(4),
                        new Numero(5)
                )
        );
        System.out.println("Expresión: ((10 - 2) * 3) + (4 * 5)");
        System.out.println("Resultado: " + expresion6.interpretar());
        System.out.println("Explicación del cálculo:");
        System.out.println("  1. (10 - 2) = 8");
        System.out.println("  2. 8 * 3 = 24");
        System.out.println("  3. 4 * 5 = 20");
        System.out.println("  4. 24 + 20 = 44");
        System.out.println();

        System.out.println("========== FIN DE LA DEMOSTRACIÓN ==========");
    }
}

