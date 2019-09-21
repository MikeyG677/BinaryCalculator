package logic;

public class Operators {

    public long add(String first, String second){
        long b1 = Long.parseLong(first, 2);
        long b2 = Long.parseLong(second, 2);
        long result = b1 + b2;
        return (result);
    }

    public long subtract(String first, String second){
        long b1 = Long.parseLong(first, 2);
        long b2 = Long.parseLong(second, 2);
        long result = b1 - b2;
        return (result);
    }

    public long divide(String first, String second){
        long b1 = Long.parseLong(first, 2);
        long b2 = Long.parseLong(second, 2);
        long result = b1 / b2;
        return (result);
    }

    public long multiply(String first, String second){
        long b1 = Long.parseLong(first, 2);
        long b2 = Long.parseLong(second, 2);
        long result = b1 * b2;
        return (result);
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

    public double squareRoot(String first, String second){
        double b1 = Long.parseLong(first, 2);
        double result = Math.pow(b1, .5);
        return (result);
    }

}
