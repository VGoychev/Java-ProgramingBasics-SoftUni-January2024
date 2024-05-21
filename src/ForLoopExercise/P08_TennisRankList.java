package ForLoopExercise;

import java.util.Scanner;

public class P08_TennisRankList {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int tour = Integer.parseInt(scanner.nextLine());
            int currentPoints = Integer.parseInt(scanner.nextLine());

            int points = 0;
            int wins = 0;

            for (int i = 1; i <= tour; i++) {
                String currentTour = scanner.nextLine();
                switch (currentTour){
                    case "W":
                        points = points + 2000;
                        wins ++;
                        break;
                    case "F":
                        points = points + 1200;
                        break;
                    case "SF":
                        points = points + 720;
                        break;
                }
            }

            System.out.printf("Final points: %d%n",currentPoints + points);
            System.out.printf("Average points: %d%n", points/tour);
            System.out.printf("%.2f%%", (wins * 1.0 /tour) * 100);
        }
}
