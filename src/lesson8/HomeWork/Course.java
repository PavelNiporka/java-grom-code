package lesson8.HomeWork;

import java.util.Date;

/**
 * Created by Паша on 08.08.2017.
 */
public class Course {
    Date startDate;
    String name;
    int hoursDuration;
    String teacherName;
    Student[] students;


    public Course(Date startDate, String name, int hoursDuration, String teacherName, Student[] students) {
        this.startDate = startDate;
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
        this.students = students;
    }
}
