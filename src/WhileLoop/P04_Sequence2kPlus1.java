package WhileLoop;

import java.util.Scanner;

public class P04_Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = 1;
        int n = Integer.parseInt(scanner.nextLine());
        while (k <= n){
            System.out.println(k);
            k = 2 * k + 1;
        }
    }
}
