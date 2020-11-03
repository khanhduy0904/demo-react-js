import java.util.Scanner;

public class btghepso {
    public static void main(String[] args) {
        //nhap vao 1 so 4 chu so
        // xuat ra ad+bc
        int x;
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
        int ad,bc;
        ad=(x/1000)*10+(x%10);
        bc=(x%1000)/10;
        System.out.println(ad + "+" + bc+"="+(ad+bc));
    }
}
