import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class nhapxuatfile {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(Paths
                .get("D:\\duy\\nguyenkhanhduy.txt"),"UTF-8");
        int integer;
        while(sc.hasNextInt()){
            integer= sc.nextInt();
            System.out.println(integer);
        }
        sc.nextLine();
        String str= sc.nextLine();
        System.out.println(str);
        sc.close(); // luon dong file khi ket thuc chuong trinh
    }
}
