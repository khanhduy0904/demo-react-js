package Exercise2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int[] arr;
        int n;
        Scanner scan= new Scanner(System.in);
        n=scan.nextInt();
        arr=new int[n];
        int mid=n/2;
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int x;
        //ktra mang doi xung
        boolean ok=true;
        for(int i=0; i<=mid;i++){
            x=n-1-i;
            if(arr[i]!=arr[x]){
                ok=false;
            }
        }
        if(ok==true){
            System.out.println("MANG DOI XUNG");
        }else{
            System.out.println("MANG KHONG DOI XUNG");
        }
    }
}
