package ExamPreparation;

import java.util.Scanner;

public class P04_PetFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        double totalFood = 0.0;
        double sumDogEat = 0.0;
        double sumCatEat = 0.0;
        double totalBiscuit = 0.0;
        for (int i = 1; i <= days; i++) {
            int dogEat = Integer.parseInt(scanner.nextLine());
            totalFood += dogEat;
            sumDogEat += dogEat;
            int catEat = Integer.parseInt(scanner.nextLine());
            totalFood += catEat;
            sumCatEat += catEat;
            if(i % 3 == 0){
                double biscuit = (dogEat + catEat) * 0.10;
                totalBiscuit += biscuit;
            }
        }
        System.out.printf("Total eaten biscuits: %.0fgr.%n", totalBiscuit);
        System.out.printf("%.2f%% of the food has been eaten.%n", totalFood * 100 / food);
        System.out.printf("%.2f%% eaten from the dog.%n", sumDogEat * 100 / totalFood);
        System.out.printf("%.2f%% eaten from the cat.", sumCatEat * 100 / totalFood);

    }
}
