package Exercise1;

import java.util.Scanner;

public class bai7 {

    //in ra tong S=1 + 1/2 + 1/3+..+n
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=(double)1/i;
        }
        System.out.printf("ket qua = %8.3f",sum);
    }
}
