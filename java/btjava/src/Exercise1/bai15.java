package Exercise1;

import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        double c;
        Scanner scan = new Scanner(System.in);
        c = scan.nextDouble();
        double pi = 0;
        int n = 0;
        double x = (1.0) / (2 * n + 1);
        while (c <= x) {
            pi += Math.pow(-1, n) * x;
            n++;
            x = (1.0) / (2 * n + 1);
        }
        pi *= 4;
        System.out.println("PI = "+pi);

    }
}