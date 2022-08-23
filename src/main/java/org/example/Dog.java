package org.example;

public class Dog {
    private String home;
    private String name;
    private String gender;
    private String breed;
    private int age;
    private int weight;
    private double dayEatsKg;

    public Dog() {
        this.home="Garage Cooperative";
        this.breed = "Watchdog";
        this.age = 1;

    }
    public Dog(String gender, String breed, int age) {
        this.gender = gender;
        this.breed = breed;
        this.age = age;
    }

    public Dog(String home, String name, String gender, String breed, int age, int weight, double dayEatsKg) {
        this.home = home;
        this.name = name;
        this.gender = gender;
        this.breed = breed;
        this.age = age;
        this.weight = weight;

        this.dayEatsKg = dayEatsKg;
    }

    public void say() {
        System.out.println("Gav Gav");
    }

    public void printInfoObj() {
        System.out.println("home = " + this.home);
        System.out.println("name = " + this.name);
        System.out.println("gender = " + this.gender);
        System.out.println("breed = " + this.breed);
        System.out.println("age = " + this.age);
        System.out.println("weight = " + this.weight);
        System.out.println("dayEatsKg = " + this.dayEatsKg);
    }

    public String getHome() {
        return home;
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

    public double getDayEatsKg() {
        return dayEatsKg;
    }

    public void setHome(String home) {
        this.home = home;
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

    public void setDayEatsKg(double dayEatsKg) {
        this.dayEatsKg = dayEatsKg;
    }
}
