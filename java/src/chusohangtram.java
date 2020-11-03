import java.util.Scanner;

public class chusohangtram {
    public static void main(String[] args) {
        int a;

        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        if(a>99){
            System.out.println((a%1000)/100);
        }else{
            System.out.println("-1");

        }
    }
}
