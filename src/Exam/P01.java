package Exam;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fats = Integer.parseInt(scanner.nextLine());
        int proteins = Integer.parseInt(scanner.nextLine());
        int carbs = Integer.parseInt(scanner.nextLine());
        int totalKcal = Integer.parseInt(scanner.nextLine());
        int water = Integer.parseInt(scanner.nextLine());

        double fatsGrams = ((double) (totalKcal * fats) / 100)/9;
        double proteinsGrams = (double) (totalKcal * proteins / 100) /4;
        double carbsGrams = (double) (totalKcal * carbs / 100) / 4;
        double foodWeight = fatsGrams + proteinsGrams + carbsGrams;
        double oneGramKcal = totalKcal / foodWeight;
        int percentLeft = 100 - water;
        double oneGramKcalWithWater = oneGramKcal * percentLeft / 100;
        System.out.printf("%.4f", oneGramKcalWithWater);
    }
}
