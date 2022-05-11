package com.company;

public class Main {

    public static void main(String[] args) {
	 Cat cat = new Cat();
     cat.setName("Milo");
     cat.setBreed("Birman");
     cat.setAge(2);

        System.out.println("Name of cat: "+cat.getName());
        System.out.println("Breed of cat: "+cat.getBreed());
        System.out.println("Age of cat: "+cat.getAge());


     Dog dog = new Dog();
     dog.setName("Borubasar");
     dog.setBreed("Taigan");
     dog.setAge(6);
        System.out.println("\nName of dog: "+dog.getName());
        System.out.println("Breed of dog: "+dog.getBreed());
        System.out.println("Age of dog: "+dog.getAge());


     Fish fish = new Fish();
     fish.setName("Batfish");
     fish.setBreed("Sprat");
     fish.setAge(1);

        System.out.println("\nName of fish: "+fish.getName());
        System.out.println("Breed of fish: "+fish.getBreed());
        System.out.println("Age of fish: "+fish.getAge());


     Parrot parrot = new Parrot();
     parrot.setName("Coco");
     parrot.setBreed("Rosella");
     parrot.setAge(2);

        System.out.println("\nName of parrot: "+parrot.getName());
        System.out.println("Breed of parrot: "+parrot.getBreed());
        System.out.println("Name of parrot: "+parrot.getAge());


    }
}
