package PB_PreExam;

import java.util.Scanner;

public class SpaceShip_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double shipWidth = Double.parseDouble(scan.nextLine());
        double shipLength = Double.parseDouble(scan.nextLine());
        double shipHeight = Double.parseDouble(scan.nextLine());
        double averageAstronautsHeight = Double.parseDouble(scan.nextLine());

        int spaceForAstronauts = (int) Math.floor((shipWidth * shipLength * shipHeight) / 2 / 2 / (averageAstronautsHeight + 0.4));

        if (spaceForAstronauts < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (spaceForAstronauts > 10) {
            System.out.println("The spacecraft is too big.");
        } else {
            System.out.printf("The spacecraft holds %d astronauts.", spaceForAstronauts);
        }
    }
}
