import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class StringAPI {
    public static boolean bangnhau(int x, int y){
        return x == y;
    }

    public static void main(String[] args) throws IOException {
        double a= 9976689879.5678;
        System.out.printf("KQ= %,10.2f\n",a);
        try (Scanner sc = new Scanner(Paths.get("D:\\duy\\khanhduy.txt"), "UTF-8")) {
            int integer;
            while (sc.hasNextInt()) {
                integer = sc.nextInt();
                System.out.println(integer);
            }
        }
    }
    /**
     *
     */
}
