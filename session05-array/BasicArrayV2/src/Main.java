import data.Student;

public class Main {
    public static void main(String[] args) {
        playWithStudentObject();
    }

    public static void playWithStudentObject() {
        Student x = new Student("HE204365", "AN NGUYỄN",  2006, 5.6);
        x.showProfile();
    }
}