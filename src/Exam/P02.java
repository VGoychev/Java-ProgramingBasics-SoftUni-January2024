package Exam;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double foodForFirst = Double.parseDouble(scanner.nextLine());
        double foodForSecond = Double.parseDouble(scanner.nextLine());
        double foodForThird = Double.parseDouble(scanner.nextLine());

        double foodNeededForFirst = days * foodForFirst;
        double foodNeededForSecond = days * foodForSecond;
        double foodNeededForThird = days * foodForThird;
        double totalNeeded = foodNeededForFirst + foodNeededForSecond + foodNeededForThird;
        if(totalNeeded < food){
            System.out.println((int)Math.floor(food-totalNeeded) + " kilos of food left.");
        }else if(totalNeeded > food){
            System.out.println((int)Math.ceil(totalNeeded-food) + " more kilos of food are needed.");
        }
    }
}
