import java.util.Scanner;

public class xephanghuychuong {
    // Dòng 1 nhập vào 6 số nguyên dương(<200) 3 số đầu là số huy chương VN sau là của TL
    // Dùng 2 cách so sánh:
    /*
          C1: So sanh tổng số huy chương
          C2: So tổng số Vàng,bạc đồng
     */
    // Dòng 2 nhập số 1 or 2 là dùng cách 1 hoặc 2 để so sánh
    // Xuất ra VN or TL nếu ai hơn còn k ss dc xuất ra TIE
    public static void main(String[] args) {
        int v1,b1,d1,v2,b2,d2;
        int tong1,tong2;
        int tong3,tong4;
        int css;
        Scanner sc= new Scanner(System.in);
        v1=sc.nextInt();
        b1=sc.nextInt();
        d1=sc.nextInt();
        v2=sc.nextInt();
        b2=sc.nextInt();
        d2=sc.nextInt();
        css=sc.nextInt();
        if(v1>=0 && v1<200 || b1>=0 && b1<200 || d1>=0 && d1<200 || v2>=0 && v2<200 || b2>=0 && b2<200 || d2>=0 && d2<200){
            if(css==1){
                tong1=v1+b1+d1;
                tong2=v2+b2+d2;
                if(tong1==tong2){
                    System.out.println("TIE");
                }else if(tong1>tong2){
                    System.out.println("VN");
                }else{
                    System.out.println("TL");
                }

            }
            if(css==2){
                tong3=v1;
                tong4=v2;
                if(tong3==tong4){
                    tong3=v1+b1;
                    tong4=v2+b2;
                    if(tong3==tong4){
                        tong3=v1+b1+d1;
                        tong4=v2+b2+d2;
                        if(tong3==tong4){
                            System.out.println("TIE");
                        }else if(tong3>tong4){
                            System.out.println("VN");
                        }else{
                            System.out.println("TL");
                        }
                    }else if(tong3>tong4){
                        System.out.println("VN");
                    }else{
                        System.out.println("TL");
                    }
                }else if(tong3>tong4){
                    System.out.println("VN");
                }else{
                    System.out.println("TL");
                }

            }
        }
        sc.close();
    }
}


