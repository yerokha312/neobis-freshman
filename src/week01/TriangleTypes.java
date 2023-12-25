package week01;

import java.util.Arrays;
import java.util.Scanner;

public class TriangleTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] sides = new double[3];

        for (int i = 0; i < sides.length; i++) {
            sides[i] = sc.nextDouble();
        }

        sc.close();

        Arrays.sort(sides);

        double a = sides[2];
        double b = sides[1];
        double c = sides[0];

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO"); // not triangle
        } else if (a * a == b * b + c * c) {
            System.out.println("TRIANGULO RETANGULO"); // rectangle triangle
        } else if (a * a > b * b + c * c) {
            System.out.println("TRIANGULO OBTUSANGULO"); // obtuse triangle
        } else if (a * a < b * b + c * c) {
            System.out.println("TRIANGULO ACUTANGULO"); // acute triangle
        }
        if (a == b && a == c) {
            System.out.println("TRIANGULO EQUILATERO"); // equilateral triangle
        } else if (a == b || a == c || b == c) {
            System.out.println("TRIANGULO ISOSCELES"); // isosceles triangle
        }

    }

}
