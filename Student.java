package Exception;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.*;


public class Student {

    private String name;
    private String surname;
    SubjectMark subjectMark;
    List<String> listStudentMArk  = new ArrayList<>();;


    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }












    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
