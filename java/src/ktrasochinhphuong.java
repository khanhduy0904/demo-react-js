import java.util.Scanner;

public class ktrasochinhphuong {
    public static void main(String[] args) {
        double x;
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
        double y;
        y= Math.sqrt(x);
        if(y*y==x){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        sc.close();
    }
}
