package week01;

import java.util.Scanner;

public class BankNotesAndCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        int[] banknotes = {100, 50, 20, 10, 5, 2};
        int[] coins = {100, 50, 25, 10, 5, 1};
        System.out.println("NOTAS:");
        for (double banknote : banknotes) {
            int quantity = (int) (amount / banknote);
            System.out.printf("%d nota(s) de R$ %s%n", quantity, String.format("%.2f", banknote));
            amount %= banknote;
        }

        amount *= 100;
        System.out.println("MOEDAS:");
        for (int coin : coins) {
            int quantity = (int) (amount / coin);
            System.out.printf("%d moeda(s) de R$ %s%n", quantity, String.format("%.2f", (double) coin / 100));
            amount %= coin;
        }

        sc.close();
    }

}

/*
NOTAS:
5 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
1 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
1 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
1 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
2 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
3 moeda(s) de R$ 0.01
 */
