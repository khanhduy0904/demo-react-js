package Exercise2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        /*
        Nhap vao 2 mang a[m] va b[n]
        Chen mang b[] vao vi tri p cua mang a
        VD: a[3] 1 5 7      b[5] 5 4 6 8 7     p=1 ( 0<= p < n)
        KQ: c[8] 1 5 5 4 6 8 7 7

         */
        int arrA[], arrB[], arrC[];
        int p;
        int m, n, k;// so luong ptu cua 3 mang
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao so ptu mang A: ");
        m = scan.nextInt();
        arrA = nhapmang(m);
        System.out.print("Nhap vao so ptu mang B: ");
        n = scan.nextInt();
        arrB = nhapmang(n);
        do {
            System.out.println("Nhap vao vi tri can chen p: ");
            p = scan.nextInt();
        } while (p < 0 || p > m);
        k = m + n;
        arrC = new int[k];
        // chen ptu tu 0-(p-1) cua mang A vao mang C
        for (int i = 0; i < p; i++) {
            arrC[i] = arrA[i];
        }
        // chen tat ca ptu mang B vao C
        for (int i = 0; i < n; i++) {
            arrC[i + p] = arrB[i];
        }
        // chen cac ptu con lai cua A vao C
        for (int i = p; i < m; i++) {
            arrC[i + n] = arrA[i];
        }
        System.out.println("Mang moi tim dc C[]= " + Arrays.toString(arrC));

    }

    public static int[] nhapmang(int n) {
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
        }
        return x;
    }

    public static Scanner scan = new Scanner(System.in);
}
