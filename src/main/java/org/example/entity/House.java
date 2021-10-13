package org.example.entity;

public class House {
    private String owner;
    private int numFloor;
    private final String address;
    private String color;

    public House(String owner, int numFloor, String color){
        this.owner = owner;
        this.numFloor = numFloor;
        this.address = "Pushkinskaya, 243";
        this.color = color;
    }
    public String getOwner(){
        System.out.println("Owner and his house: ");
        System.out.print("Owner: ");
        return owner;
    }
    public int getNumFloor(){
        System.out.print("Number of floors: ");
        return numFloor;
    }
    public String getAddress(){
        System.out.print("Address: ");
        return address;
    }
    public String getColor(){
        System.out.print("Color of house: ");
        return color;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

}
