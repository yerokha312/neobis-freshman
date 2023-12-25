package week01;

import java.util.Scanner;

public class GameTimeWithMinutes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hoursStart = sc.nextInt();
        int minutesStart = sc.nextInt();
        int hoursEnd = sc.nextInt();
        int minutesEnd = sc.nextInt();
        sc.close();

        int durationInMinutes = ((hoursEnd * 60) + minutesEnd) - ((hoursStart * 60) + minutesStart);

        if (durationInMinutes == 0) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else if (durationInMinutes > 0) {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", durationInMinutes / 60, durationInMinutes % 60);
        } else {
            durationInMinutes += 1440;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", durationInMinutes / 60, durationInMinutes % 60);
        }
    }
}