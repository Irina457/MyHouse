package org.example.entity;

public class House {
    private String owner;
    private int numFloor;
    private final String address;
    private String color;

    private Owner ownerName;
    private Owner ownerSurname;
    private Owner ownerAge;

    public House(String owner, int numFloor, String color){

        this.owner = owner;
        this.numFloor = numFloor;
        this.address = "Pushkinskaya, 243";
        this.color = color;

        this.ownerName = new Owner();
        ownerName.setName("Masha");

        this.ownerSurname = new Owner();
        ownerSurname.setSurname("Petrova");

        this.ownerAge = new Owner();
    }

    public String getOwner(){
        return owner;
    }

    public int getNumFloor(){

        return numFloor;
    }

    public String getAddress(){

        return address;
    }

    public String getColor(){

        return color;
    }

    public String getName(){
        return ownerName.getName();
    }

    public String getSurname(){
        return ownerSurname.getSurname();
    }

    public final int getAge(){
        return ownerAge.getAge();
    }




}
