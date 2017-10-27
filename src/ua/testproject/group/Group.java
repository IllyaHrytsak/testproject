/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.testproject.group;

import java.util.ArrayList;
import java.util.List;
import ua.testproject.student.Student;

/**
 *
 * @author Java
 */
public class Group {
    
    private String groupName;
    
    private List<Student> students = new ArrayList<>();
    
    private Student warden;

    public Group(String groupName, List<Student> students) {
        this.groupName = groupName;
        this.students = students;
    }

    public Student choseMainStudent() {
        List<Student> tempStudents = new ArrayList<>();
        if (students != null && !students.isEmpty()) {
            tempStudents.addAll(students);
            tempStudents.sort(new GroupComporator());
            return tempStudents.get(0);
        }
        return null;
    }
    
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getMainStudent() {
        return warden;
    }

    public void setMainStudent(Student mainStudent) {
        this.warden = mainStudent;
    }
    
    
    
}
