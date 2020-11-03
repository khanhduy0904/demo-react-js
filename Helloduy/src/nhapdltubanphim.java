import java.util.Scanner;

public class nhapdltubanphim {
    public static void main(String[] args) {
        // bai tap xet 3 canh cua tam giac
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("nhap vao a:");
        a= sc.nextInt();
        System.out.println("nhap vao b:");
        b=sc.nextInt();
        System.out.println("nhap vao c:");

    c=sc.nextInt();
        if(latamgiac(a,b,c)){
            System.out.println("Ba canh ban nhap la tam giac");
            if(latamgiacdeu(a,b,c)){
                System.out.println("Va con deu nua");
            }else{
                if(latamgiaccan(a,b,c)){
                    System.out.println("Va con can nua");
                }
                if(latamgiacvuong(a,b,c)){
                    System.out.println("Va con vuong nua");
                }
            }

        }else{
            System.out.println("Ba canh ban nhap khong tao thanh tam giac");
        }


    }
    public static boolean latamgiac(int a, int b, int c){
        if((a+b)>c || (a+c)>b || (b+c)> a ){
            return true;
        }else return false;
    }
    public static boolean latamgiacvuong(int a, int b, int c){
        if((a*a+b*b)==c*c || (a*a+c*c)==b*b || (b*b+c*c)==a*a){
            return true;
        }else return false;
    }
    public static boolean latamgiaccan(int a, int b, int c){
        if((a==b || a==c || b==c)){
            return true;
        }else return false;
    }
    public static boolean latamgiacdeu(int a, int b, int c){
        if(a==b && b==c && a==c){
            return true;
        }else return false;
    }

}
