package logic;

public class Operators {

    public long add(long first, long second){
        return (first + second);
    }

    public long subtract(long first, long second){
        return (first - second);
    }

    public long divide(long first, long second){
        return (first / second);
    }

    public long multiply(long first, long second){
        return (second * second);
    }

    public long square(long first){
        if (first < 0)
            first = -first;
        long result = first;
        for (long i = 1; i < first; i++){
            result += first;
        }
        return (result);
    }

    public double squareRoot(long first){
        return (Math.pow(first, .5));
    }
}
