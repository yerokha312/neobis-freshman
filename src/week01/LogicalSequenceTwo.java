package week01;

import java.util.Scanner;

public class LogicalSequenceTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = 1; i <= y; i++) {
            System.out.print(i % x == 0? i + "\n" : i + " ");
        }
    }
}