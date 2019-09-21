package logic;

public class InputInterpreter {

    private long number1 =0,number2 =0;
    private String operator =null;

    public void number1Catch(String number1){
        this.number1 = Long.parseLong(number1, 2);
    }

    public void number2Catch(String number2){
        this.number2 = Long.parseLong(number2,2);
    }

    public String answerThrower(){
        long ans =0;

        if ("add".equals(this.operator)) {
            ans = Operators.add(this.number1,this.number2);
        } else if ("sub".equals(this.operator)) {
            ans = Operators.subtract(this.number1,this.number2);
        } else if("mul".equals(this.operator)) {
            ans = Operators.multiply(this.number1,this.number2);
        } else if("div".equals(this.operator)) {
            ans = Operators.divide(this.number1,this.number2);
        } else {
            System.err.println("Internal error");
            System.exit(1);
        }

        return Long.toBinaryString(ans);
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
        } else if("pow".equals(operand)){
            this.operator = operand;
        } else if("sqrt".equals(operand)){
            this.operator = operand;
        }else{
            System.err.println("Internal error");
            System.exit(1);
        }
    }



}
