package PB_PreExam;

import java.util.Scanner;

public class GoldMine_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int locationsCount = Integer.parseInt(scan.nextLine());


        for (int i = 0; i < locationsCount; i++) {

            double goldFromCurrentLocation = 0;
            double averageGoldPerDayExpected = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());

            for (int j = 0; j < days; j++) {
                goldFromCurrentLocation += Integer.parseInt(scan.nextLine());
            }

            if (!((goldFromCurrentLocation / days) < averageGoldPerDayExpected)) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", goldFromCurrentLocation / days);
            } else {
                System.out.printf("You need %.2f gold.%n", ( Math.abs(averageGoldPerDayExpected - goldFromCurrentLocation / days)));
            }

        }
    }
}
