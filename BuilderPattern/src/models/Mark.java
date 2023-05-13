package models;

import java.util.PrimitiveIterator;

public class Mark {
    private int id;
    private int math;
    private int english;

    public Mark(int math, int english) {
        this.math = math;
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
}
