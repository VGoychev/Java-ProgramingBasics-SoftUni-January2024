package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        //Превръщаме всичко в минути, защото са ни най-малката мерна единица
        int examTotalMinutes = examHour * 60 + examMinutes;
        int arrivalTotalMinutes = arrivalHour * 60 + arrivalMinutes;

        //Праавим една променлива int, в която ще пазим минутите за закъснение
        int diff = Math.abs(examTotalMinutes - arrivalTotalMinutes);
        //Проверяваме дали общите минути на пристигане са по-големи от общите минути на изпита
        if(arrivalTotalMinutes > examTotalMinutes){
            //Принтираме, че е закъснял
            System.out.println("Late");

            //Проверяваме дали е < 60 мин или е > 60 мин
            if (diff < 60){
                System.out.printf("%d minutes after the start", diff);
            } else {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        } else if (diff <= 30) {

            System.out.println("On time");
            if (examTotalMinutes != arrivalTotalMinutes){
                System.out.printf("%d minutes before the start", diff);
            }

        } else {
            System.out.println("Early");
            int hour = diff / 60;
            int minutes = diff % 60;
            if (diff < 60){
                System.out.printf("%d minutes before the start", minutes);
            } else {
                System.out.printf("%d:%02d hours before the start ", hour, minutes);
            }
        }
    }
}
