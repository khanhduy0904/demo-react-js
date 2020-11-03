package Exercise1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        // in ra "*" tao thanh hinh cn
        int a,b;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();//chieu cao hcn
        b=sc.nextInt();//chieu rong hcn
        for(int i=0;i<a;i++){
            for(int j=0; j<b; j++){
                System.out.print(" * ");
            }
            System.out.println();// in xuong dong
        }
    }
}
