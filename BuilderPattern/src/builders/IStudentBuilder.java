package builders;

import models.Major;
import models.Mark;
import models.Student;
import models.StudentClass;

public interface IStudentBuilder {
    public StudentBuilder name(String name);
    public StudentBuilder age(int age);
    public StudentBuilder address(String address);
    public StudentBuilder addStudentClass(StudentClass studentClass);
    public StudentBuilder addMajor(Major major);
    public StudentBuilder addMark(Mark mark);
    public Student build();
}
