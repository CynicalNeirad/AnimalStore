package com.example.animalclass;

public class Animal {
    private String name;

    public Animal() {
        System.out.println("Constructor is running");
        System.out.println("An animal has been created");
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name.toLowerCase();
    }

    public String sleep() {
        return "An animal sleeps...";
    }
    public String eat() {
        return "An animal eats...";
    }

}

