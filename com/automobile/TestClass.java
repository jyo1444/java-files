package com.automobile;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class TestClass {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Honda honda = new Honda();
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Registration Number: " + hero.getRegistrationNumber());
        System.out.println("Owner Name: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();
        System.out.println();
        System.out.println("Model: " + honda.getModelName());
        System.out.println("Registration Number: " + honda.getRegistrationNumber());
        System.out.println("Owner Name: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdPlayer();
    }
}
