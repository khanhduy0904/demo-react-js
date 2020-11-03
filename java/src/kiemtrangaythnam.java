import java.util.Scanner;

public class kiemtrangaythnam {
    public static void main(String[] args) {
       // nhap 3 so nguyen ngay thang nam ktra xem co hop le hay k
        // ngay phai tuong ung voi thang
        //nam >=1990
        //nam nhuan chia het cho 400 or chia het cho 4 nhung k chia het cho 100
        //output:yes/no
        int ng,th,n;
        Scanner sc= new Scanner(System.in);
        ng=sc.nextInt();
        th=sc.nextInt();
        n=sc.nextInt();
        if((ng<0) || (ng>31) || (th<0) || (th>12) || (n<=1990)){
            System.out.println("NO");

        }else{
            if(th==2){
                if(n%400==0 || (n%4==0 && n%100!=0)){
                    if(ng<=29){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }

                }else if(ng<=28){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
            if(th==1 || th==3 || th==5 || th==7 || th==8 || th==10 || th==12){
                if(ng<=31){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
            if(th==4 || th==6 || th==9 || th==11){
                if(ng<=30){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }


    }
}
