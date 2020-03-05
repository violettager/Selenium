package com.cybertek.tests.day3_Locators2;

import com.github.javafaker.Faker;

public class FakerPractice {
    public static void main(String[] args) {
        //create Faker object
        Faker fakedata = new Faker();

        // i need first name
        String name = fakedata.name().firstName();
        System.out.println(name);

    }
}
