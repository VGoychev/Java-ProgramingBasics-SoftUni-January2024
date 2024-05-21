package ConditionalStatementsExercise;

import java.util.Scanner;

public class P08_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int e = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        double timeForLunch = (double) p / 8.0;
        double timeForBreak = (double) p / 4.0;
        double timeLeft = p - timeForLunch - timeForBreak;
        double diff = Math.ceil(Math.abs(timeLeft - e));

        if (timeLeft >= e){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name , diff);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name , diff);
        }
    }
}
