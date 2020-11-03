package Exercise1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        //in ra hcn bang "*"
        //chi in ra khung hcn
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();//chieu cao hcn
        b = sc.nextInt();//chieu rong hcn
        for (
                int i = 0;
                i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(i==0 || i==a-1 || j==0 || j==b-1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();// in xuong dong
        }
    }
}

