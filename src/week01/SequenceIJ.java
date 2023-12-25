package week01;

public class SequenceIJ {
    public static void main(String[] args) {
        for (double i = 0; i <= 2; i += 0.2) {
            i = Math.round(i * 10) / 10.0;
            for (int j = 1; j < 4; j++) {
                System.out.printf(i % 1== 0 ? "I=%.0f J=%.0f%n" : "I=%.1f J=%.1f%n", i, i + j);
            }
        }
    }
}
