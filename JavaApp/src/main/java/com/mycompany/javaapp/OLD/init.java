/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaapp;

import static com.mycompany.javaapp.init.swap;

/**
 *
 * @author Gabriel
 */
public class init {

    public static void init() {
        Integer x = 5;
        Integer y = 9;
        System.out.println("Before Swap x: " + x + " y: " + y);
        swap(x, y);
        System.out.println("After Swap x: " + x + " y: " + y);

    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

    public static void arrays(String[] args) {
        System.out.println(args[0]);
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);

            }
        }
    }

}
