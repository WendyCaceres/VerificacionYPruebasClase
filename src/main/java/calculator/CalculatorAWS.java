package calculator;

public class CalculatorAWS {

    Calculator calcService;

    public CalculatorAWS(){
        calcService = new Calculator();
    }
    public int getFact(int number){
        int f=1;
        for (int i = 1; i <= number; i++) {
            f = calcService.mult(f,i);
        }
        return f;
    }

}
