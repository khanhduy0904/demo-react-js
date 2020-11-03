package Exercise1;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        //liet ke n so nguyen to dau tien
        // nhap 5, ket qua: 2 3 5 7 11
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int x = 2;
        int count = 0;
        while (true) {
            if (laNgTo(x)) {
                System.out.print(x + " ");
                count++;
            }
            if (count == n) {
                break;
            }
            x++;
        }

    }

    public static boolean laNgTo(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
