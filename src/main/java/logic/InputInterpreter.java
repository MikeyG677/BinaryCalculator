package logic;

public class InputInterpreter {

    private int number1 =0,number2 =0;
    private String operator =null;

    public String number1Catch(String number1){
        if(number1 == " "|| number1 == null){
            throw new NumberFormatException("enter a number");
        }
        this.number1 = Integer.parseInt(number1, 2);
        return "";
    }

    public String number2Catch(String number2){
        if(number2 == " "|| number2 == null){
            throw new NumberFormatException("enter a number");
        }
        this.number2 = Integer.parseInt(number2,2);
        return " ";
    }

    public String answerThrower(){
        int ans =0;
        Operators opt =new Operators();
        if ("add".equals(this.operator)) {
            ans = opt.add(this.number1,this.number2);
        } else if ("sub".equals(this.operator)) {
            ans = opt.subtract(this.number1,this.number2);
        } else if("div".equals(this.operator)) {
            if (this.number2 == 0){
                throw new ArithmeticException("trying to divide by zero");
            }else {
                ans = opt.divide(this.number1, this.number2);
            }
        } else if("mul".equals(this.operator)) {
            ans = opt.multiply(this.number1,this.number2);
        } else if("sqrt".equals(this.operator)) {
            ans = (int) opt.squareRoot(this.number1);
        }else if("sqr".equals(this.operator)) {
            ans = opt.square(this.number1);
        }else{
            System.err.println("Internal error");
            if(operator == null){
                throw new NullPointerException("no operator");
            }
            throw new IllegalArgumentException(operator+" is an invalid operator");
        }
        this.number1 = ans;
        return Integer.toBinaryString(ans);
    }

    public void operandCatch(String operand){

        if ("add".equals(operand)) {
            this.operator = operand;
        } else if ("sub".equals(operand)) {
            this.operator = operand;
        } else if("mul".equals(operand)){
            this.operator = operand;
        } else if("div".equals(operand)){
            this.operator = operand;
        } else if("sqr".equals(operand)){
            this.operator = operand;
        } else if("sqrt".equals(operand)){
            this.operator = operand;
        }else{
            throw new IllegalArgumentException(operand+" is an invalid operator");
        }
    }



}
