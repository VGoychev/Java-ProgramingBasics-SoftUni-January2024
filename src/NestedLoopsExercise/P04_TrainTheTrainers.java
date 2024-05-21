package NestedLoopsExercise;

import java.util.Scanner;

public class P04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        int countPresentation = 0;
        double totalAll = 0.0;
        while (!name.equals("Finish")){
            String namePresentation = name;
            countPresentation++;
            double GradeSum = 0.0;

            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                GradeSum += grade;
            }

            double average = GradeSum / n;
            System.out.printf("%s - %.2f.%n", namePresentation , average);
            totalAll += average;
            name = scanner.nextLine();
        }
        double averageAll = totalAll / countPresentation;
        System.out.printf("Student's final assessment is %.2f.", averageAll);
    }
}
