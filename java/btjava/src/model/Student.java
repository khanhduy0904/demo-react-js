package model;

public class Student {
    private String name;
    private String ID;
    private  int studentYears;
    private float avgMarts;

    public void gotoSchool(){
        System.out.println("Dang o nha");

    }
    public void doExams(){

    }
    public void study(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getStudentYears() {
        return studentYears;
    }

    public void setStudentYears(int studentYears) {
        this.studentYears = studentYears;
    }

    public float getAvgMarts() {
        return avgMarts;
    }

    public void setAvgMarts(float avgMarts) {
        this.avgMarts = avgMarts;
    }
}
