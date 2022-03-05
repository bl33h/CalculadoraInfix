package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class InfixPostfixTest {

	@Test
    public void InfixCalculator(){
        Calculator calculator = new Calculator();
        assertEquals(55, calculator.Evaluate("1 2 + 4 * 1 - 5 *"));
        assertEquals(-1, calculator.Evaluate("4 5 -"));
        assertEquals(-7, calculator.Evaluate("9 6 5 * - 3 /"));
    }
}
