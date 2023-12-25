package week01;

import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        int interWins = 0;
        int gremioWins = 0;
        int grenaisCount = 1;
        int empatesCount = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int interGoals = sc.nextInt();
                int gremioGoals = sc.nextInt();
                if (interGoals > gremioGoals) {
                    interWins++;
                } else if (gremioGoals > interGoals) {
                    gremioWins++;
                } else {
                    empatesCount++;
                }
                System.out.println("Novo grenal (1-sim 2-nao)");
                if (sc.nextInt() == 2) {
                    break;
                } else {
                    grenaisCount++;
                }
            }
        }
        System.out.printf(
                "%d grenais%n" +
                "Inter:%d%n" +
                "Gremio:%d%n" +
                "Empates:%d%n",
                grenaisCount, interWins, gremioWins, empatesCount);
        System.out.println(interWins > gremioWins ?
                "Inter venceu mais" : interWins < gremioWins ?
                "Gremio venceu mais" : "Não houve vencedor");
    }
}