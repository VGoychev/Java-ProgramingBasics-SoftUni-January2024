package NestedLoops;

public class P01_Clock {
    public static void main(String[] args) {
        for (int hour = 0; hour <= 23; hour++) {

            for (int minute = 0; minute <= 59 ; minute++) {
                System.out.println(hour + ":" + minute);
            }
        }
    }
}
