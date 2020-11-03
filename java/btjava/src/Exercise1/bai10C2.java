package Exercise1;

import java.util.Scanner;

public class bai10C2 {
    public static void main(String[] args) {
        //phan tich 1 so thanh tich cac so nguyen to
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print( i + " x ");
                n /= i;
            }
        }
        System.out.print("\b\b\b");
    }
}
