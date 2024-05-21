package ForLoopExercise;

import java.util.Scanner;

public class P06_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int judge = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= judge; i++) {
            String judgeName = scanner.nextLine();
            double currentPoint = Double.parseDouble(scanner.nextLine());

            academyPoints += judgeName.length() * currentPoint / 2;
            if ( academyPoints >= 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor,academyPoints);
                break;
            }

        }
        if ( academyPoints < 1250.5){
            double diff = 1250.5 - academyPoints;
            System.out.printf("Sorry, %s you need %.1f more!", actor, diff);
        }

    }
}
