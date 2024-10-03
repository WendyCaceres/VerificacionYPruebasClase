package calculatorTest;

import calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void verifyAddPositiveNumber(){
        Calculator calculator = new Calculator();
        int expectedResult = 4;
        int actualResult = calculator.add(2,2);
        Assertions.assertEquals(expectedResult,actualResult,
                "ERROR las suma es incorrecta, revise el codigo!");
    }

}
