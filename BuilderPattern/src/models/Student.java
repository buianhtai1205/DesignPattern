package models;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private StudentClass studentClass;
    private Major major;
    private Mark mark;

    public Student(String name, int age, String address, StudentClass studentClass, Major major, Mark mark) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentClass = studentClass;
        this.major = major;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student: " + this.name + ", " + this.age + ", " + this.address + ", "
                + this.studentClass.getName() + ", "
                + this.major.getName() + ", "
                + this.mark.getMath() + ", "
                + this.mark.getEnglish();
    }
}
