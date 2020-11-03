package Exercise1;

import java.util.Scanner;

public class bai5C1 {
    public static void main(String[] args) {
        /*
           nhap vao so nguyen x(x>0 && x<=100)
           lay ngau nhien cac so trong khoang nay cho toi khi gia tri do =x
           in ra tung buoc thuc hien
         */
        int x;
        Scanner scan= new Scanner(System.in);
        System.out.println("So ban nhap: ");
        x= scan.nextInt();
        int z=1;
        for(int i=0; i<=100 ; i++){
            int y;
            System.out.println("So ban lay lan thu" + z + ":");
            y=scan.nextInt();
            z++;
            if(y==x){
                System.out.println("day la so ban can tim:" + y);
                System.out.println("So buoc phai thuc hien:" + (z-1));
                break;
            }
        }
    }
}
