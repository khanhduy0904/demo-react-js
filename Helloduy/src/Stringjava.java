public class Stringjava {
    public static void main(String[] args) {
        //khai niem string(chuoi,xau)
        // chuoi con
        // noi chuoi
        String fullname="nguyen khanh duy";//khoi tao bien string
        String lastname= fullname.substring(0,6);// cach tao chuoi con
        String firstname=fullname.substring(6);
        System.out.println("ho cua ban la:"+lastname);
        System.out.println("ten cua ban la:"+firstname);
        System.out.println("ten day du cua ban la:"+fullname);
        String noichuoi= lastname + firstname + " se co viec trong name 2020";
        System.out.println(noichuoi);
    }
}
