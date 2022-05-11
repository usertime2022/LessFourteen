package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat cat = new Cat();
        cat.setColor("Grey");
        cat.setWeight(2);
        cat.setName("Tom");
        cat.setAge(2);
        cat.setHeight(20);
        cat.setBread("Tiger");


        Tiger1 tiger = new Tiger1();
        tiger.setAge(20);
        tiger.setColor("Black-Yellow");
        tiger.setWeight(250);
        tiger.setBread("Bengal");
        tiger.setSpeed(100);

        tiger.makeVoice();
    }
}
