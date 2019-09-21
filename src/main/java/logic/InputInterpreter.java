package logic;

public class InputInterpreter {

    //make private variables to hold until equal sign is pressed

    public void number1Catch(String number1){
        //set a private variable
    }

    public void number2Catch(String number2){
        //set a private variable
    }

    public String answerThrower(){
        // enter the number/s in the appropriate Operators.method
        return null;
    }

    public void operandCatch(String operand){

        if ("add".equals(operand)) {
        } else if ("sub".equals(operand)) {
        } else if("mul".equals(operand)){
        } else if("div".equals(operand)){
        } else if("pow".equals(operand)){
        } else if("sqrt".equals(operand)){
        }else{
            System.err.println("Internal error");
            System.exit(1);
        }
    }



}
