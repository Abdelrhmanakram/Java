package seven;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        clubFc clubFc=new clubFc();

        clubFc.setId(1);
        clubFc.setName("cluuub1");
        clubFc.setNumber(12345);
        clubFc.setFcode(54321);
        clubFc.print();

        System.out.println("---------------------");


        clubRel clubRel=new clubRel();

        clubRel.setId(2);
        clubRel.setName("cluuub2");
        clubRel.setNumber(6789);
        clubRel.setRcode(9876);
        clubRel.print();

    }
}