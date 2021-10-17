package org.example.entity;

public class Owner {
    private final String name;
    private String surname;
    private int age;

    public Owner(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age ;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){return surname;}

    public final int getAge(){
        return age;
    }
}
