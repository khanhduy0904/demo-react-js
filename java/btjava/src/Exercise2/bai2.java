package Exercise2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int n;
        int[] arr, res;
        System.out.print("nhap vao so luong ptu: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arr = new int[n];
        res = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            res[i] = -1;
        }
        int count;
        //dem so lan xuat hien cua cac ptu
        for (int i = 0; i < n; i++) {
            count = 1;
            for (int j = i + 1; j < n; j++) {
                if (res[j] != 0 && arr[i] == arr[j]) {
                    count++;
                    res[j] = 0;
                }

            }
            if (res[i] != 0) {
                res[i] = count;
            }
        }
        // tim so lan xuat hien max
        int max;
        max = res[0];
        for (int i = 0; i < n; i++) {
            if (res[i] > max) {
                max = res[i];
            }
        }
        // xuat ra ket qua
        System.out.println("So lan xuat hien max: " + max);
        System.out.println("Cac phan tu: ");
        for (int i = 0; i < n; i++) {
            if (res[i] == max) {
                System.out.print(arr[i] + " ");
            }
        }


    }
}
