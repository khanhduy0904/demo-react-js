package Exercise1;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        // nhap vao n roi liet ke ra cac uoc cua n
        long n;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf("%6d",i);
                count++;
            }
        }
        System.out.println();
        System.out.println(" So " +  n  + " co " + count + " uoc");
    }
}
