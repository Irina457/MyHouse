package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class House {
    private int numFloor;
    private final String address;
    private String color;

    private Owner owner;

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