package ExerciseUpcoder;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        // kiem tra xem 2 so co phai ban be hay k
        // tong so uoc bang voi so kia la ban be
        int a,b;
        Scanner scan= new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        int s=0;
        int check=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                s+=i;
                if(s>b){
                    check=0;
                    break;
                }else if(s==b){
                    check=1;
                }
            }
        }
        if(check==1){
            s=0;
            for(int j=1;j<b;j++){
                if(b%j==0){
                    s+=j;
                    if(s>a){
                        check=0;
                    }else if(s==a){
                        check=1;
                    }
                }
            }

        }
        if(check==1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
