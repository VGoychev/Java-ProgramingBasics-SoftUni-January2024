package Exam;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double totalRakia = 0;
        double totalDegree = 0;
        for (int days = 1; days <= n; days++) {
            double rakia = Double.parseDouble(scanner.nextLine());
            double degree = Double.parseDouble(scanner.nextLine());
            totalRakia = totalRakia + rakia;
            totalDegree = totalDegree + rakia * degree;
        }
        double averageDegree = totalDegree / totalRakia;
        System.out.printf("Liter: %.2f%n", totalRakia);
        System.out.printf("Degrees: %.2f%n", averageDegree);
        if(averageDegree < 38){
            System.out.println("Not good, you should baking!");
        } else if (averageDegree <= 42){
            System.out.println("Super!");
        } else if(averageDegree > 42){
            System.out.println("Dilution with distilled water!");
        }
    }
}
