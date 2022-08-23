package org.example;

public class Cat {
    private String name;
    private String gender;
    private String breed;
    private int age;
    private int weight;
    private int hoursOfSleep;


    public Cat() {
        this.name = "Homeless";
        this.breed = "Unidentified";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, String gender, String breed, int age, int weight,
               int hoursOfSleep) {
        this.name = name;
        this.gender = gender;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.hoursOfSleep = hoursOfSleep;
    }

    public void say() {
        System.out.println("Meow Meow");
    }

    public void printInfoObj() {
        System.out.println("name = " + this.name);
        System.out.println("gender = " + this.gender);
        System.out.println("breed = " + this.breed);
        System.out.println("age = " + this.age);
        System.out.println("weight = " + this.weight);
        System.out.println("hoursOfSleep= " + this.hoursOfSleep);
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHoursOfSleep() {
        return hoursOfSleep;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHoursOfSleep(int hoursOfSleep) {
        this.hoursOfSleep = hoursOfSleep;
    }

}

