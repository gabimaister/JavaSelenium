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
public class polimorphism {

    int age;
    String name;
    Boolean decide;

    void decide() {
        System.out.println("Test polimorphism decide !!!");
    }
    
    void decide(int x) {
        System.out.println("Test polimorphism decide !!!");
    }

}

class child extends polimorphism {

    @Override
    void decide() {
        System.out.println("Test child decide !!!");
    }
    
    @Override
    void decide(int x) {
        System.out.println("Test child decide !!!");
    }

    public void main(String args[]) {
        polimorphism c1 = new child();
        c1.decide();
    }

}
