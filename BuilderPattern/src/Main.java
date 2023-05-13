import builders.StudentBuilder;
import models.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(
                "Tai",
                21,
                "HCM",
                new StudentClass("201101A"),
                new Major("Software Technology", new Faculty("Information technology")),
                new Mark(9, 8)
        );
        System.out.println(student.toString());

        var student2 = new StudentBuilder()
                .name("Tai")
                .age(21)
                .address("HCM")
                .addStudentClass(new StudentClass("201101A"))
                .addMajor(new Major("Software Technology", new Faculty("Information technology")))
                .addMark(new Mark(9, 8))
                .build();


        System.out.println(student2.toString());
    }
}