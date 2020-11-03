package Exercise1;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        //in ra tong cac chu so cua 1 so nguyen bat ki
        //12345= 1+2+3+4+5=15
        int n,x;
        int sum=0;
        Scanner scan= new Scanner(System.in);
        n=scan.nextInt();
        while(n>0){
            x=n%10;
            n/=10;
            sum+=x;
        }
        System.out.println(sum);
    }
}
