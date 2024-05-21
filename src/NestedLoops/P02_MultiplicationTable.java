package NestedLoops;

public class P02_MultiplicationTable {
    public static void main(String[] args) {

        for (int multiplicator1 = 1; multiplicator1 <= 10; multiplicator1++) {

            for (int multiplicator2 = 1; multiplicator2 <= 10 ; multiplicator2++) {
                System.out.println(multiplicator1 + " * " + multiplicator2 + " = " + multiplicator1*multiplicator2);
            }
        }
    }
}
