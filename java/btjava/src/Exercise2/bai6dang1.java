package Exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class bai6dang1 {
    /*
    Nhap vao 1 mang a[n] va 1 gia tri x.
    a dc sap xep theo thu tu tang dan.
    Hay chen x vao mang a sao cho van giu nguyen tinh sap xep cua mang.
     */
    public static void main(String[] args) {
        int n, x;
        int[] arr;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Nhap vao gia tri x: ");
        x = scan.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            // chen vao cuoi
            arr[n] = x;
        } else {
            // chen vao vi tri tu 0--> n-1
            for (int i = n; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
        }
        System.out.println("Mang sau khi chen ptu x: "+ Arrays.toString(arr));

    }
}
