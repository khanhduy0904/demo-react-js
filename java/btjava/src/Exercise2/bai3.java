package Exercise2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        /*
        Doc vao 1 day so a co n ptu la cac so nguyen. Nhap vao 1 so X
        Xd vi tri cua so nguyen to tren a co gtri gan x nhat.
         */
        int n, x;
        int index = -1, min = Integer.MAX_VALUE;
        int[] arr;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao so ptu trong mang: ");
        n = scan.nextInt();
        System.out.println();
        System.out.print("Nhap vao gia tri x: ");
        x = scan.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            int currenmin=getMin(arr[i],x);
            if(ktraSoNgto(arr[i]) && currenmin< min){
                min=currenmin;
                index=i;
            }
        }
        //xuat ket qua
        if(index!=-1){
            System.out.println("ptu la so ngto co gtri gan x nhat: a["+index+"]");
            System.out.println("Gia tri la: "+arr[index]);
        }else{
            System.out.println("Khong co gia tri thoa man");
        }


    }
    public static int getMin(int a, int x){
        return Math.abs(a-x);
    }

    public static boolean ktraSoNgto(int n) {
        if (n < 2) {
            return false;
        }
        int a = (int) Math.sqrt(n);
        for (int i = 2; i <= a; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
