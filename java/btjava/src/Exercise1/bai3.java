package Exercise1;

import java.util.Scanner;

public class bai3 {
    /*
         in ra tam giac nhu hinh
                 1
               1 2 1
            1  2 3 2 1
            code dau vao: nhap vao c.cao:h, chieu rong:2h
            code xu li:thuat toan giup in ra tam giac nhu tren(vong lap long nhau)
     */
    public static void main(String[] args) {
        int cCao;
        Scanner scan= new Scanner(System.in);
        cCao=scan.nextInt();
        int x,output;
        for(int i=1; i<=cCao;i++){
            for(int j=0;j<=2*cCao;j++){
                x=j-cCao;
                if(x<0){
                    x*=-1;
                }
                output=i-x;
                if(output>0){
                    System.out.printf("%3d",output);
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
