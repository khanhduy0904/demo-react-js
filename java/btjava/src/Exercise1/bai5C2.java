package Exercise1;

import java.util.Random;
import java.util.Scanner;

public class bai5C2 {
    public static void main(String[] args) {
        int input;
        Scanner scan = new Scanner(System.in);
        input= scan.nextInt();
        int count=0;
        Random random = new Random();
        while(true){
            int randnumber= random.nextInt(100);// lay ngau nhien cac so 1-99( o lay 100)
            count ++;
            System.out.println("So random la:" + randnumber);
            if(randnumber==input){
                System.out.println("Thuc hien" + count + "lan");
                break;
            }
        }
    }
}
