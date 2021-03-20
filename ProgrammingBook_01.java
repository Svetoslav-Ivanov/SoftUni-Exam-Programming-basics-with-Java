package PB_PreExam;

import java.util.Scanner;

public class ProgrammingBook_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pagePrice = Double.parseDouble(scan.nextLine());
        double coverPrice = Double.parseDouble(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());
        double designerPrice = Double.parseDouble(scan.nextLine());
        int percentPaidFromTheTeam = Integer.parseInt(scan.nextLine());

        double totalBookPrice = (899 * pagePrice) + (2 * coverPrice);
        totalBookPrice *= ((double) (100 - discount) / 100);
        double totalProjectPrice = totalBookPrice + designerPrice;
        totalProjectPrice *= ((double) (100 - percentPaidFromTheTeam) / 100);
        System.out.printf("Avtonom should pay %.2f BGN.",
                totalProjectPrice);
    }
}
