package Exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class bai6dang2 {
    public static void main(String[] args) {
        int n, vtcc, soCanchen;
        int[] arr;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao so luong ptu:");
        n = scan.nextInt();
        arr = nhapMang(n ,scan);
        System.out.println("Nhap vao vi tri can chen: ");
        vtcc = scan.nextInt();
        System.out.println("Nhap vao so can chen: ");
        soCanchen = scan.nextInt();
        for (int i = n; i >=vtcc ; i--) {
            arr[i] = arr[i-1];
        }
        n++;
        arr[vtcc] = soCanchen;
        System.out.println("Mang sau khi dc chen: "+ Arrays.toString(arr));

    }

    public static int[] nhapMang(int n, Scanner scan) {
        int[] x = new int[n + 1];
        for (int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
        }
        return x;

    }
}


