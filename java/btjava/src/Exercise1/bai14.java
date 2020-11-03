package Exercise1;

import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        // nhap vao 2 so tu nhien m,n(m<n)
        //liet ke cac so chinh phuong trong doan [m,n]
        //co bao nhieu so chinh phuong
        int m, n;
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        n = scan.nextInt();
        int count = 0;
        if ((m>=0 && n>=0) || n>=0) {
            for (int i = m; i <= n; i++) {
                if(i>=0){
                    int tmp=(int)Math.sqrt(i);
                    if(tmp*tmp==i){
                        System.out.printf("%5d",i);
                        count++;
                        if(count%10==0){
                            System.out.println();
                        }
                    }
                }
            }
            System.out.println();
            System.out.printf("Tong so chinh phuong doan MN: " + count);
        } else {
            System.out.println("fails");
        }

    }
}
