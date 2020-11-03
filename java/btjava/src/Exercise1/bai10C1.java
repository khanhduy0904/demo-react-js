package Exercise1;

import java.util.Scanner;

public class bai10C1 {
    public static void main(String[] args) {
        //phan tich 1 so nguyen thanh tich cac thua so nguyen to
        //vd: 28= 2x2x7
        int n;
        Scanner scan= new Scanner(System.in);
        n=scan.nextInt();
        int i=2;
        if(n==1){
            System.out.println(n+"="+1);
        }else{
            System.out.print(n+" = ");
            while(n!=1){
                if(n%i==0){
                    System.out.print(i+" x ");
                    n/=i;
                }else{
                    i++;
                }
            }
            System.out.print("\b\b\b");
        }
    }
}
