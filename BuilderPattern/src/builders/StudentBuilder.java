package builders;

import models.Major;
import models.Mark;
import models.Student;
import models.StudentClass;

public class StudentBuilder implements IStudentBuilder{
    private String name;
    private int age;
    private String address;
    private StudentClass studentClass;
    private Major major;
    private Mark mark;

    @Override
    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public StudentBuilder age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public StudentBuilder address(String address) {
        this.address = address;
        return this;
    }

    @Override
    public StudentBuilder addStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
        return this;
    }

    @Override
    public StudentBuilder addMajor(Major major) {
        this.major = major;
        return this;
    }

    @Override
    public StudentBuilder addMark(Mark mark) {
        this.mark = mark;
        return this;
    }

    @Override
    public Student build() {
        return new Student(name, age, address, studentClass, major, mark);
    }
}
