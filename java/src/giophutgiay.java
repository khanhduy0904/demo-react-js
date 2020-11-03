import java.util.Scanner;

public class giophutgiay {
    public static void main(String[] args) {
        // nhap vao gio phut giay ktra co hop le k?
        //DOng dau xuat YES
        // Dong 2 xuat gio sau do +1 giay
        int h,m,s;
        Scanner sc= new Scanner(System.in);
        h=sc.nextInt();
        m=sc.nextInt();
        s=sc.nextInt();
        if(h>23 || h<0 || m>59 || m<0 || s>59 || s<0){
            System.out.println("NO");
        }else{
            System.out.println("YES");
            s+=1;
            if(s>=60){
                s=0;
                m+=1;
                if(m>=60){
                    m=0;
                    h+=1;
                    if(h==24){
                        h=0;
                    }
                }

            }

        }
        System.out.println(h+":"+m+":"+s);
    }
}
