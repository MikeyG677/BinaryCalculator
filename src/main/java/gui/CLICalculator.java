package gui;

import logic.Operators;

import java.util.Scanner;

public class CLICalculator {

    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        System.out.println("number please");
        int one = key.nextInt();
        System.out.println("number please");
        int two = key.nextInt();
        System.out.println(Integer.toBinaryString((one+two)));
        System.out.println(Integer.parseInt("0100",2)+Integer.parseInt("0100",2));
        System.out.println(one+two);
        System.out.println(new Operators().add(one, two));

    }

}
