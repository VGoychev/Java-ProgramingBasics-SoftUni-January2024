package NestedLoopsExercise;

import java.util.Scanner;

public class P03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int primeNum = 0;
        int nonPrimeNum = 0;
        while(!input.equals("stop")){
            int number = Integer.parseInt(input);
            if(number < 0){
                System.out.println("Number is negative.");
            } else {
                boolean isPrime = true;
                for (int divisor = 2; divisor < number; divisor++) {
                    if (number % divisor == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    primeNum += number;
                } else {
                    nonPrimeNum += number;
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + primeNum);
        System.out.println("Sum of all non prime numbers is: " + nonPrimeNum);
    }
}
