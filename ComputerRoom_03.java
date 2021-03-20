package PB_PreExam;

import java.util.Scanner;

public class ComputerRoom_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int hours = Integer.parseInt(scan.nextLine());
        int personsCount = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();

        double pricePerPersonForOneHour = 0;

        switch (month) {
            case "march":
            case "april":
            case "may":
                if (time.equals("day")) {
                    pricePerPersonForOneHour = 10.50;
                } else {
                    pricePerPersonForOneHour = 8.40;
                }
                break;
            case "june":
            case "july":
            case "august":
                if (time.equals("day")) {
                    pricePerPersonForOneHour = 12.60;
                } else {
                    pricePerPersonForOneHour = 10.20;
                }
                break;
        }

        if (personsCount>3){
            pricePerPersonForOneHour *= 0.9;
        }
        if (hours>4){
            pricePerPersonForOneHour *= 0.5;
        }

        System.out.printf("Price per person for one hour: %.2f%n",pricePerPersonForOneHour);
        System.out.printf("Total cost of the visit: %.2f",pricePerPersonForOneHour * personsCount * hours);
    }
}
