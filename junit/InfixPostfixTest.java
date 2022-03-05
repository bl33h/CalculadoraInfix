// ****************************************************************************
package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class InfixPostfixTest {

	@Test
    public void InfixCalculator(){
    Calculator calculator = new Calculator();
    Stack<Integer> stackInteger = (new FactoryCasio<Integer>()).newCasio(1, 1);
    Stack<String> stackString = (new FactoryCasio<String>()).newCasio(1,1);
    assertEquals(55, calculator.Evaluate("( ( ( ( 1 + 2 ) * 4 ) - 1 ) * 5 ) ", stackInteger, stackString, 1));
    assertEquals(1, calculator.Evaluate("( 5 - 4 )",stackInteger, stackString, 1));
    //
}
