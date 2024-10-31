package InfectionCorona;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> infection=new HashMap<>() ;


            while(true) {

                System.out.println("Enter country name (or type 'exit' to stop):  ");
                String country = scanner.nextLine();
                if (country.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.println("Enter numberInfected of infected citizens:");
                int numberInfected = scanner.nextInt();
                scanner.nextLine();

                if (infection.containsKey(country)) {
                    infection.put(country, infection.get(country)  + numberInfected);
                } else {
                    infection.put(country , numberInfected);
                }
            }

        System.out.println("Infection data:");
        for (Map.Entry<String, Integer> entry : infection.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        }


    }
