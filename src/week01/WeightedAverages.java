package week01;

import java.util.Scanner;

public class WeightedAverages {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfTestCases = sc.nextInt();

        for (int i = 0; i < numberOfTestCases; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double weightedAverage = (a * 2 + b * 3 + c * 5) / (2 + 3 + 5);
            System.out.printf("%.1f%n", weightedAverage);
        }

        sc.close();
    }

}