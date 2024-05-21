package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P12_TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double commission = 0.00;
        switch (city) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * (5.0/100);
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * (7.0 / 100);
                } else if (sales > 1000 && sales <= 10000){
                    commission = sales * (8.0 / 100);
                } else if ( sales > 10000){
                    commission = sales * (12.0 / 100);
                } else {
                    System.out.println("error");
                    break;
                }
                System.out.printf("%.2f", commission);
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * (4.5/100);
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * (7.5 / 100);
                } else if (sales > 1000 && sales <= 10000){
                    commission = sales * (10.0 / 100);
                } else if ( sales > 10000){
                    commission = sales * (13.0 / 100);
                } else {
                    System.out.println("error");
                    break;
                }
                System.out.printf("%.2f", commission);
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * (5.5/100);
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * (8.0/ 100);
                } else if (sales > 1000 && sales <= 10000){
                    commission = sales * (12.0 / 100);
                } else if ( sales > 10000){
                    commission = sales * (14.5 / 100);
                } else {
                    System.out.println("error");
                    break;
                }
                System.out.printf("%.2f", commission);
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
