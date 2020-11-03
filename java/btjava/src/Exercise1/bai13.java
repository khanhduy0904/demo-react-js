package Exercise1;

public class bai13 {
    public static void main(String[] args) {
        //in ra cac so thuan nghich co 6 chu so
        int count=0;
        for(int i=100000;i<=999999;i++){
            int tmp=0;
            int n=i;
            while(n>0){
                tmp=tmp*10 + n%10;
                n/=10;
            }
            if(tmp==i){
                System.out.printf("%10d",i);
                count++;
                if(count%10==0){
                    System.out.println();
                }
            }
        }

    }
}
