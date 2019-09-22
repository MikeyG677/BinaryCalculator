package logic;


import org.junit.Assert;
import org.junit.Test;

public class InterpreterTests {

    private InputInterpreter input;

    @Test
    public void testAnswerThrowerTrue(){
        input = new InputInterpreter();
        input.number1Catch("11001010");
        input.number2Catch("1000110");
        input.operandCatch("add");
        String ans = input.answerThrower();
        Assert.assertNotNull("it isnt",ans);
    }
    
    @Test(expected = NullPointerException.class)
    public void testAnswerThrowerFalse(){
        input = new InputInterpreter();
        String ans = input.answerThrower();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testOperandCatchError(){
        input = new InputInterpreter();
        input.operandCatch("4353");
    }

    @Test(expected = ArithmeticException.class)
    public void testAnswerThrowerError(){
        input = new InputInterpreter();
        input.number1Catch("11001010");
        input.number2Catch("0");
        input.operandCatch("div");
        input.answerThrower();
    }
}
