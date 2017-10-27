/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.testproject.group;

import java.util.Comparator;
import ua.testproject.student.Student;

/**
 *
 * @author Java
 */
public class GroupComporator implements Comparator<Student> {

    @Override
    public int compare(Student stud1, Student stud2) {
         int comp = stud2.getAge().compareTo(stud1.getAge());
         if (comp == 0) {
             comp = stud2.getSex().getSex().compareTo(stud1.getSex().getSex());
             if (comp == 0) {
                 return stud2.getSurname().compareTo(stud1.getSurname());
             } else {
                 return comp;
             }
         } else {
             return comp;
         }
    }
    
}
