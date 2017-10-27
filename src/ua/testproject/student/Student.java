/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.testproject.student;


/**
 *
 * @author Java
 */
public class Student {
    
    private String name;
    
    private String surname;
    
    private Integer age;
    
    private Sex sex;
    
    private boolean present;

    public Student(String name, String surname, Integer age, Sex sex, boolean present) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.present = present;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }
    
    
}
