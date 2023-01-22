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
public class abstract_class {

    final int test=2;
    
    public static void main() {
        Iphone obj = new Iphone();
        Samsung obj2 = new Samsung();
        show(obj);
    }

     static void show(phone obj) {
        obj.showConfig();
    }

}

 abstract class phone implements interface_class {

    public abstract void showConfig();
}

class Iphone extends phone {

    @Override
    public void showConfig() {
        System.out.println("Iphone....");
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAge() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Samsung extends phone {

    @Override
    public void showConfig() {
        System.out.println("Samsung....");
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAge() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
