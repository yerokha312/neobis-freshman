package week01;

import java.util.Scanner;

public class PopulationIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        for (int i = 0; i < numberOfTestCases; i++) {
            int numberOfYears = 0;
            int populationA = sc.nextInt();
            int populationB = sc.nextInt();
            double populationIncreaseRateA = sc.nextDouble() / 100;
            double populationIncreaseRateB = sc.nextDouble() / 100;

            do {
                populationA += (int) (populationA * populationIncreaseRateA);
                populationB += (int) (populationB * populationIncreaseRateB);
                numberOfYears++;
            } while (numberOfYears <= 100 && populationA <= populationB);
            System.out.println(numberOfYears > 100 ? "Mais de 1 seculo." : numberOfYears + " anos.");
        }
        sc.close();

    }

}