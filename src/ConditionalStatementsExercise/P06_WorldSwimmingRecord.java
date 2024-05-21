package ConditionalStatementsExercise;

import java.util.Scanner;

public class P06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double metres = Double.parseDouble(scanner.nextLine());
        double timeFor1m = Double.parseDouble(scanner.nextLine());

        double timeForSwim = metres * timeFor1m;
        double addedTime = Math.floor((metres/15)) * 12.5;
        double sumTime = timeForSwim + addedTime;
        if(sumTime >= record){
            double timeOut = sumTime - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeOut);
        } else if ( sumTime < record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", sumTime);
        }
    }
}
