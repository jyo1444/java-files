package com.automobile;
import com.automobile.twowheeler.*;
import com.automobile.fourwheeler.*;
/*
import com.automobile.fourwheeler.Ford;
import com.automobile.fourwheeler.Logan;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;*/
public class TestClass2 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Honda honda = new Honda();

        Logan logan = new Logan();
        Ford ford = new Ford();
        
        System.out.println("----- Subclass Hero -----");
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println("----- Subclass Honda -----");
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdPlayer();

        System.out.println("----- Subclass Logan -----");
        System.out.println("Speed: " + logan.speed());
        logan.gps();

        System.out.println("----- Subclass Ford -----");
        System.out.println("Speed: " + ford.speed());
        ford.tempControl();
    }
}
