package logic;

import org.junit.Assert;
import org.junit.Test;

public class OperatorsTests {

    @Test
    public void testAdd(){
        Operators operator = new Operators();
        Assert.assertEquals(8,operator.add(2,6));
    }

    @Test
    public void testSubtract(){
        Operators operator = new Operators();
        Assert.assertEquals(8,operator.subtract(10,2));
    }

    @Test
    public void testMultiply(){
        Operators operator = new Operators();
        Assert.assertEquals(16, operator.multiply(4,4));
    }

    @Test
    public void testDivide(){
        Operators operator = new Operators();
        Assert.assertEquals(5,operator.divide(20,4));
    }

    @Test
    public void testSquare(){
        Operators operator = new Operators();
        Assert.assertEquals(64,operator.square(8));
    }

    @Test
    public void testSquareRoot(){
        Operators operator = new Operators();
        Assert.assertEquals(5,operator.squareRoot(25),2);
    }
}
