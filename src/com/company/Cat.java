package com.company;

public class Cat {
    private String name;
    private String breed;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            System.out.println("Age can't be a negative number");
        } else{
            this.age = age;
        }

    }
}
