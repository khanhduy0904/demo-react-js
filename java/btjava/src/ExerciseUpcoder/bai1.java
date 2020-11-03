package ExerciseUpcoder;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int s=0;
        for(int i=1;i>0;i++){
            int n;
            Scanner scan= new Scanner(System.in);
            n=scan.nextInt();
            s+=n;
            if(n==0){
                break;
            }
        }
        s%=10;
        if(s==0){
            System.out.println("DEP");
        }else if(s==5){
            System.out.println("TRUNG BINH");
        }else{
            System.out.println("XAU");
        }
    }
}
