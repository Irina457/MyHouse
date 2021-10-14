package org.example.entity;

public class Owner {
    private String name;
    private String surname;
    private final int age = 20;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public final int getAge(){
        return age;
    }
}
