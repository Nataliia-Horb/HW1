package org.example;

public class Main {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        Cat cat2=new Cat("Teddi", 2 );
        Cat cat3=new Cat("Miki", "Boy", "Persian Cat", 1,8,  9);
        Dog dog1=new Dog();
        Dog dog2=new Dog("Boy","Dalmatians", 5);
        Dog dog3=new Dog("Apartment","Josephine","Girl", "Pekingese", 8, 10, 2 );
        Pig pig1=new Pig();
        Pig pig2=new Pig("Village", 65, 8);
        Pig pig3=new Pig("Farm", "Small Piggy", "Girl", 1, 88, 7);
        cat1.say();
        cat2.say();
        cat3.printInfoObj();
        dog1.say();
        dog2.say();
        dog3.printInfoObj();
        pig1.say();
        pig2.say();
        pig3.printInfoObj();
    }
}