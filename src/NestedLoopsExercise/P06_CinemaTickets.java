package NestedLoopsExercise;

import java.util.Scanner;

public class P06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int standard = 0;
        int student = 0;
        int kid = 0;
        int total = 0;
        while (!input.equals("Finish")){
            String movieName = input;
            int seats = Integer.parseInt(scanner.nextLine());
            int freeSeats = seats;
            int takenSeats = 0;
            String ticket = scanner.nextLine();
            while (!movieName.equals("End")){

                if(ticket.equals("standard")){
                    standard++;
                    freeSeats--;
                    takenSeats++;
                    total++;
                    if(freeSeats <= 0){
                        double sum = (double) (takenSeats * 100) / seats;
                        System.out.printf("%s - %.2f%% full.%n", movieName,sum);
                        break;
                    }
                }else if(ticket.equals("student")){
                    student++;
                    freeSeats--;
                    takenSeats++;
                    total++;
                    if(freeSeats <= 0){
                        double sum = (double) (takenSeats * 100) / seats;
                        System.out.printf("%s - %.2f%% full.%n", movieName,sum);

                        break;
                    }
                }else if(ticket.equals("kid")){
                    kid++;
                    freeSeats--;
                    takenSeats++;
                    total++;
                    if(freeSeats <= 0){
                        double sum = (double) (takenSeats * 100) / seats;
                        System.out.printf("%s - %.2f%% full.%n", movieName,sum);

                        break;
                    }
                }
                if(ticket.equals("End")){
                    double sum = (double) (takenSeats * 100) / seats;
                    System.out.printf("%s - %.2f%% full.%n", movieName,sum);
                    break;
                }
                ticket = scanner.nextLine();
            }
            input = scanner.nextLine();
        }
        double sumStud = (double) (student * 100) / total;
        double sumStand = (double) (standard * 100) / total;
        double sumKid = (double) (kid * 100) / total;
        System.out.printf("Total tickets: %d%n", total);
        System.out.printf("%.2f%% student tickets.%n",sumStud);
        System.out.printf("%.2f%% standard tickets.%n",sumStand);
        System.out.printf("%.2f%% kids tickets.",sumKid);


    }
}
