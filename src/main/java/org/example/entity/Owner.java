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
        System.out.print("Name of the Owner: ");
        return name;
    }

    public String getSurname(){
        System.out.print("Surname of the Owner: ");
        return surname;
    }

    public int getAge(){
        System.out.print("Age of the Owner: ");
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
}
