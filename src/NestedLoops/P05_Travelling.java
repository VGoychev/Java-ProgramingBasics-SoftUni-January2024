package NestedLoops;

import java.util.Scanner;

public class P05_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("End")){
            double neededMoney = Double.parseDouble(scanner.nextLine());
            double savedMoney = Double.parseDouble(scanner.nextLine());
            while (savedMoney<neededMoney){
                //spesteni pari
                double sum = Double.parseDouble(scanner.nextLine());
                savedMoney = savedMoney + sum;
            }
            System.out.printf("Going to %s!%n", input);

            //sledvashta destinaciq
            input = scanner.nextLine();
        }

    }
}
