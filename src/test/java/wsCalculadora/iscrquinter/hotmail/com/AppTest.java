/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wsCalculadora.iscrquinter.hotmail.com;

import org.junit.Test;

import wsCalculadora.iscrquinter.hotmail.com.Calculadora.Calculadora;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void testSuma() {
        Calculadora c = new Calculadora();

        assertTrue(c.suma(2,3)==5);
    }

    @Test public void testResta() {
        Calculadora c = new Calculadora();

        assertTrue(c.resta(2,3)==-1);
    }

    @Test public void testMult() {
        Calculadora c = new Calculadora();

        assertTrue(c.multiplica(2,3)==6);
    }
}
