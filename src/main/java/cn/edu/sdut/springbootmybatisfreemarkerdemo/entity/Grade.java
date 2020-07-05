package cn.edu.sdut.springbootmybatisfreemarkerdemo.entity;

import java.util.List;

public class Grade {
    private int gradeid;
    private String gradename;
    private List<Student> students;

    public Grade() {
    }

    public Grade(int gradeid, String gradename) {
        this.gradeid = gradeid;
        this.gradename = gradename;
    }

    public Grade(int gradeid, String gradename, List<Student> students) {
        this.gradeid = gradeid;
        this.gradename = gradename;
        this.students = students;
    }

    public int getGradeid() {
        return gradeid;
    }

    public void setGradeid(int gradeid) {
        this.gradeid = gradeid;
    }

    public String getGradename() {
        return gradename;
    }

    public void setGradename(String gradename) {
        this.gradename = gradename;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeid=" + gradeid +
                ", gradename='" + gradename + '\'' +
                ", students=" + students +
                '}';
    }
}
