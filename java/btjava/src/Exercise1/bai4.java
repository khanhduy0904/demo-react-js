package Exercise1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        // in ra bang cuu chuong
        for(int i=1; i<10; i++){
            for(int j=0; j<=10; j++){
                System.out.printf("%2d x %2d = %3d \n ",i,i,(i*j));
            }
            System.out.println();
        }
    }
}
