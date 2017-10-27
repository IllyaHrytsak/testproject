/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.testproject;

import java.util.ArrayList;
import java.util.List;
import ua.testproject.group.Group;
import ua.testproject.lecturer.Lecturer;
import ua.testproject.student.*;

/**
 *
 * @author Java
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student student1 = new Student("Ivan", "Petrov", 18, Sex.MALE, true);
        Student student2 = new Student("Alina", "Tokovenko", 18, Sex.FEMALE, true);
        Student student3 = new Student("Illya", "Hrytsak", 17, Sex.MALE, false);
        Student student4 = new Student("Dmitriy", "Andreev", 18, Sex.MALE, false);
        Student student5 = new Student("Katya", "Zdor", 17, Sex.FEMALE, true);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Group group = new Group("ST-142", students);

        Lecturer lecturer = new Lecturer("Vladimir", "Kvasnikov", group);

        Student mainStudent = group.choseMainStudent();

        System.out.println("Warden: " + mainStudent.getName() + " " + mainStudent.getSurname());
        

        lecturer.checkStudents();
    }

}
