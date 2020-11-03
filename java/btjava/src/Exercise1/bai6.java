package Exercise1;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        // in ra tong S=1+3+5+7+n neu n le
        //in ra tong S=2+4+6+8+...neu n chan
        int n,i;
        Scanner scan= new Scanner(System.in);
        n=scan.nextInt();
        if(n%2==0){
            i=2;
        }else{
            i=1;
        }
        long sum=0;
        for(; i<=n;i+=2){
            sum +=i;
        }
        System.out.println(sum);
    }
}
