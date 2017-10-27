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
public enum Sex {
    MALE(0), FEMALE(1);
    
    private final Integer sex;
    
    Sex(Integer sex) {
       this.sex = sex;
    }

    public Integer getSex() {
        return sex;
    }
    
    
}
