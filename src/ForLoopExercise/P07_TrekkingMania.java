package ForLoopExercise;

import java.util.Scanner;

public class P07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfGroups = Integer.parseInt(scanner.nextLine());
        int musalaGroups = 0;
        int monblanGroups = 0;
        int kilimanjaroGroups = 0;
        int k2Groups = 0;
        int everestGroups = 0;
        for (int i = 1; i <= numberOfGroups; i++) {
            int group = Integer.parseInt(scanner.nextLine());

            if(group <= 5){
                musalaGroups+= group;
            } else if (group <= 12) {
                monblanGroups+= group;
            } else if (group <= 25) {
                kilimanjaroGroups+= group;
            } else if (group <= 40) {
                k2Groups+= group;
            } else {
                everestGroups+= group;
            }
        }
        int allGroups = musalaGroups + monblanGroups + kilimanjaroGroups + k2Groups + everestGroups;
        Double musalaPercent = (musalaGroups * 1.0 / allGroups)* 100;
        Double monblanPercent = (monblanGroups * 1.0 / allGroups) * 100;
        Double kilimanjarolaPercent = (kilimanjaroGroups * 1.0 / allGroups) * 100;
        Double k2Percent = (k2Groups * 1.0 / allGroups) * 100;
        Double everestPercent = (everestGroups * 1.0 / allGroups) * 100;

        System.out.printf("%.2f%%%n", musalaPercent);
        System.out.printf("%.2f%%%n", monblanPercent);
        System.out.printf("%.2f%%%n", kilimanjarolaPercent);
        System.out.printf("%.2f%%%n", k2Percent);
        System.out.printf("%.2f%%%n", everestPercent);


    }
}
