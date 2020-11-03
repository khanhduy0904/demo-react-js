package ExerciseUpcoder;

import model.Student;

public class nhap {
    public static void main(String[] args) {
        Student studenA = new Student();
        studenA.setName("Nguyen Khanh Duy");
        String name= studenA.getName();
        System.out.println(studenA.getName());
        studenA.gotoSchool();
    }
}
