package com.company;

public class Animal {
    private int weight;
    private String color;
    private int age;

    public void makeVoice() {
        System.out.println("Animal is making voice!");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
