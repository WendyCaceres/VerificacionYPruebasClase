package calculatorTest;

import calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class CalculatorDivTest {

    // positive / acceptance
    @Test
    public void verifyDiv(){
        Calculator calculator = new Calculator();
        int expectedResult=3;
        int actualResult=calculator.div(9,3);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la division es incorrecta");
    }

   // negative
    @Test
    public void verifyDiv0(){
        Calculator calculator = new Calculator();
        Assertions.assertThrows(
                Exception.class,() -> {calculator.div(9,0);}
        );
    }


}
