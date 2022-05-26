/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaapp;

/**
 *
 * @author Gabriel
 */
public class animal implements interface_class, interface_class_2 {

    int age;
    String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getName2() {
        return this.name;
    }

    @Override
    public int getAge2() {
        return this.age;
    }

}
