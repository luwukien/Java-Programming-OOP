package util.data;

/**
 * @author Chi Kien-Luu | github/luwukien
 * Date: 11/19/2024
 */

public class Student {
    private String id;
    private String name;
    private int birth;
    private double gpa;

    public Student(String id, String name, int birth, double gpa) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.gpa = gpa;
    }

    //getter

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBirth() {
        return birth;
    }

    public double getGpa() {
        return gpa;
    }

    //setter

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //show profile of a student
    public void showProfile() {
        System.out.printf("|ID      |Name                     |Birth|GPA|");
        System.out.printf("|%8s|%-25s|%-5d|%.3f|");

    }
    //toString()
    @Override
    public String toString() {
        return "ID Student: " + id + "Name Student: " + name +
                "; Year of birth: " + birth + "; GPA: " + gpa;
    }
}
