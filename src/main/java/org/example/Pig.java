package org.example;

public class Pig {
    private String home;
    private String name;
    private String gender;
    private int age;
    private int weight;
    private double dayEatsKg;

    public Pig(String home, int weight, double dayEatsKg) {
        this.home = home;
        this.weight = weight;
        this.dayEatsKg = dayEatsKg;
    }

    public Pig() {
        this.home = "Village";
        this.weight = 50;
        this.dayEatsKg = 5;
    }

    public Pig(String home, String name, String gender, int age, int weight, double dayEatsKg) {
        this.home = home;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.dayEatsKg = dayEatsKg;
    }

    public void say() {
        System.out.println("Khryu Khryu Naf Naf");
    }

    public void printInfoObj() {
        System.out.println("home = " + this.home);
        System.out.println("name = " + this.name);
        System.out.println("gender = " + this.gender);
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
