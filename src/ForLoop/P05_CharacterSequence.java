package ForLoop;

import java.util.Scanner;

public class P05_CharacterSequence {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        for (int index = 0; index < text.length(); index++) {
            char symbol = text.charAt(index);
            System.out.println(symbol);
        }
    }
}
