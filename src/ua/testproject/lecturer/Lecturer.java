/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.testproject.lecturer;

import java.util.ArrayList;
import java.util.List;
import ua.testproject.group.Group;
import ua.testproject.student.Student;

/**
 *
 * @author Java
 */
public class Lecturer {
 
    private String name;
    
    private String surname;
    
    private Group group;

    public Lecturer(String name, String surname, Group group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }
    
    
    public void checkStudents() {
        List<Student> presentStudents = new ArrayList<>();
        List<Student> absentStudents = new ArrayList<>();
        for (Student student : group.getStudents()) {
            if (student.isPresent()) {
                presentStudents.add(student);
            } else {
                absentStudents.add(student);
            }
        }
        
        System.out.println("Present students - " + presentStudents.size());
        for (Student student : presentStudents) {
            System.out.println(student.getName() + " " + student.getSurname());
        }
        System.out.println("Absent students - " + absentStudents.size());
        
        for (Student student : absentStudents) {
            System.out.println(student.getName() + " " + student.getSurname());
        } 
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
    
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
    
}
