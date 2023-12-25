package week01;

import java.util.Scanner;


public class ColumnInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int column = sc.nextInt();
        String operation = sc.next();
        String nextLine = sc.nextLine();

        double[][] twoDimArray = new double[12][12];

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = sc.nextDouble();
            }
        }

        sc.close();

        double result = 0;

        for (double[] row : twoDimArray) {
            result += row[column];
        }

        if (operation.equals("S")) {
            System.out.println(result);
        } else {
            System.out.printf("%.1f%n", result / twoDimArray.length);
        }

    }

}
