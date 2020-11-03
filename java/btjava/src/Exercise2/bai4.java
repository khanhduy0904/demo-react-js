package Exercise2;

import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        /*
        Tao mang ngau nhien a[N] sau do thuc hien;
        -Sap xep theo thu tu tang dan
        -Loai bo cac gia tri gan nhau sao cho moi gtri chi xuat hien torng a 1 lan.
         */
        int n;
        int[] arr;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        int[] arrB = new int[n];
        int bSize = 0;
        boolean kiemTra;
        for (int i = 0; i < n; i++) {
            kiemTra = false;
            for (int j = 0; j < bSize; j++) {
                if (arr[i] == arrB[j]) {
                    kiemTra = true;
                    break;
                }
            }
            if (!kiemTra) {
                arrB[bSize++] = arr[i];
            }
        }
        //sap xep mang
        System.out.println("Mang truoc khi sap xep: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Mang sau khi sap xep: ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // xuat ra mang cac ptu chi xuat hien 1 lan
        System.out.println("Mang sau khi loai bo cac ptu trung nhau va chua sap xep:");
        System.out.println(Arrays.toString(arrB));
        System.out.println("Mang sau khi loai bo ptu trung nhau da sap xep: ");
        Arrays.sort(arrB);
        System.out.println(Arrays.toString(arrB));

    }
}
