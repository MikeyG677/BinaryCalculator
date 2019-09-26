package logic;

public class Operators {

    public int add(int first, int second){
        return (first + second);
    }

    public int subtract(int first, int second){
        return (first - second);
    }

    public int divide(int first, int second){
        return (first / second);
    }

    public int multiply(int first, int second){
        return (first * second);
    }

    public int square(int first){
        if (first < 0)
            first = -first;
        int result = first;
        for (int i = 1; i < first; i++){
            result += first;
        }
        return (result);
    }

    public double squareRoot(int first){
        return (Math.pow(first, .5));
    }
}
