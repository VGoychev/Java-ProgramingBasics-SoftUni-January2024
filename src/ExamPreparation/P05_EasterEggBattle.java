package ExamPreparation;

import java.util.Scanner;

public class P05_EasterEggBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String winner = command;
            if(winner.equals("one")){
                second--;
                if(second == 0){
                    break;
                }
            } else if (winner.equals("two")){
                first--;
                if(first == 0){
                    break;
                }
            }
            command = scanner.nextLine();
        }
        if(first == 0){
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", second);
        } else if (second == 0){
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", first);
        } else {
            System.out.printf("Player one has %d eggs left.%n", first);
            System.out.printf("Player two has %d eggs left.", second);
        }
    }
}
