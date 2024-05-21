package Exam;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayCount = 0;
        int start = 5364;
        int end = 8848;
        int totalClimbed = start;
        String input = scanner.nextLine();
        while (!input.equals("END")){
            String command = input;
            int metresClimbed = Integer.parseInt(scanner.nextLine());
            if (command.equals("Yes")){
                dayCount++;
                if(dayCount == 5){
                    break;
                }
                totalClimbed = totalClimbed + metresClimbed;

            } else if (command.equals("No")) {
                totalClimbed = totalClimbed + metresClimbed;
            }
            if(totalClimbed >= end){
                break;
            }
            input = scanner.nextLine();
        }
        if(totalClimbed >= end){
            System.out.printf("Goal reached for %d days!", dayCount + 1);
        } else {
            System.out.printf("Failed!%n");
            System.out.println(totalClimbed);
        }
    }
}
