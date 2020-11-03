import java.util.Scanner;

public class bt {
    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        String c = sc.next();
        if(c=="+"){
            System.out.println(a+"+"+b+"="+(a+b));
        }
        if(c=="-"){
            System.out.println(a+"-"+b+"="+(a-b));
        }
        if(c=="*"){
            System.out.println(a+"*"+b+"="+(a*b));
        }
        if(c=="%"){
            System.out.println(a+"%"+b+"="+(a%b));
        }
        sc.close();
    }
}
