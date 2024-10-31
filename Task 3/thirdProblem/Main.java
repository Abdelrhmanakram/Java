package thirdProblem;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Summation summation=new Summation();

        summation.setNum1(2);
        summation.setNum2(3);
        summation.setNum3(6);

        summation.sum();
        summation.print();

    }
}