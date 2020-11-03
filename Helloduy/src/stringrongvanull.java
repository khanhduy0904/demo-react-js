public class stringrongvanull {
    public static void main(String[] args) {
        String firstname="duy";
        String secondname="Duy";
        //String la bat bien vi cac ki tu trong string khong the thay doi
        /*
        So sanh  hai chuoi
        - So sanh co phan biet hoa thuong: dung equals
        - So sanh khong phan biet hoa thuong: dung equalsIgnorecase
         */
        System.out.println(firstname.equals(secondname));
        System.out.println(firstname.equalsIgnoreCase(secondname));

    }
}
