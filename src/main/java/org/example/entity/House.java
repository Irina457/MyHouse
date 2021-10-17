package org.example.entity;

public class House {
    private int numFloor;
    private final String address;
    private String color;

    private Owner owner;

    public House(int numFloor, String address, String color, Owner owner){
            this.numFloor = numFloor;
            this.address = address;
            this.color = color;
            this.owner = owner;
        }

//    @Getter public int numFloor;

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
            return owner.getName();
        }

        public String getSurname(){
            return owner.getSurname();
        }

        public final int getAge(){
            return owner.getAge();
        }
    }