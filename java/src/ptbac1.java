import java.util.Scanner;

public class ptbac1 {
    public static void main(String[] args) {
        float a, b, x;
        // Ax + b = 0
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("VSN");
            } else {
                System.out.println("VN");
            }
        } else {
            x = -b / a;
            System.out.printf("%.2f", x);
        }
    }
}
