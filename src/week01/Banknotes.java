package week01;

import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        System.out.println(amount);
        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};

        for (int banknote : banknotes) {
            int quantity = amount / banknote;
            System.out.println(quantity + " nota(s) de R$ " + banknote + ",00");
            amount %= banknote;
        }

        sc.close();
    }
}
