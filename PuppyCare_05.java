package PB_PreExam;

import java.util.Scanner;

public class PuppyCare_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalFood = Integer.parseInt(scan.nextLine()) * 1000;
        String command = scan.nextLine();

        while (!command.equals("Adopted")) {
            int foodEaten = Integer.parseInt(command);
            totalFood -= foodEaten;

            command = scan.nextLine();
        }
        if (totalFood<0){
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(totalFood));
        } else {
            System.out.printf("Food is enough! Leftovers: %d grams.",totalFood);
        }
    }
}
