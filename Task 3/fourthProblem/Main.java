package fourthProblem;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Player player=new Player();

        player.setId(1);
        player.setName("Abdo");
        player.setNumber(123);
        player.print();


        Student student=new Student();
        student.setId(1);
        student.setName("Abdo");
        student.setAge(23);
        student.print();
    }
}