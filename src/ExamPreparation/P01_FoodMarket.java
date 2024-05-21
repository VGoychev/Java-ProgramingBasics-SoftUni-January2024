package ExamPreparation;

import java.util.Scanner;

public class P01_FoodMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawPrice = Double.parseDouble(scanner.nextLine());
        double bananas = Double.parseDouble(scanner.nextLine());
        double oranges = Double.parseDouble(scanner.nextLine());
        double berry = Double.parseDouble(scanner.nextLine());
        double strawberry = Double.parseDouble(scanner.nextLine());
        double berryPrice = strawPrice / 2;
        double orangePrice = berryPrice * 0.60;
        double bananaPrice = berryPrice * 0.20;
        double sumStraw = strawPrice * strawberry;
        double sumBan = bananaPrice * bananas;
        double sumOr = orangePrice * oranges;
        double sumBer = berryPrice * berry;
        double sum = sumStraw + sumBer + sumOr + sumBan;
        System.out.printf("%.2f", sum);
    }
}
