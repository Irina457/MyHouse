package org.example.entity;

public class Owner {
    private String name;
    private String surname;
    private final int age;

    public Owner(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.age = 20;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){return surname;}

    public final int getAge(){
        return age;
    }
}
