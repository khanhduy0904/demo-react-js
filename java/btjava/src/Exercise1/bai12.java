package Exercise1;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        /*
        Day fibonacci dc dinh nghia nhu sau
        F0 = 0, F1=1 , Fi = Fi-1 + Fi-2
        Nhap n voi 2<=n<=90. Viet ctrinh in ra so fibonacci dau tien
         */
        int n;
        Scanner scan= new Scanner(System.in);
        n= scan.nextInt();
        long f0= 0, f1=1 , fn=0;
        for(int i=0;i<=n;i++){
            if(i<2){
                System.out.println(i);
            }else{
                fn=f0+f1;
                f0=f1;
                f1=fn;
                System.out.println(fn);
            }
        }

    }
}
