package org.example;

import org.example.entity.House;
import org.example.entity.Owner;

/*
Создать 3 класса - Application, House, Owner
В каждом классе должны быть и изменяемые, и неизменяемые поля, все поля - приватные
У дома есть один владелец, количество этажей, адрес и цвет
У владельца есть имя, фамилия, возраст
Дом может выдать владельца, выдать остальные свои поля
Владелец может представиться (рассказать о себе)
Необходимо в методе main создать дом и вывести на печать информацию о его владельце
*/
public class Application {
    public static void main(String[] args){
        House house = new House("Neighbor", 9, "white");

        System.out.println("House and its owner: ");
        System.out.println("House:");

        System.out.println("Owner: " + house.getOwner());
        System.out.println("Number of floors: " + house.getNumFloor());
        System.out.println("Address: " + house.getAddress());
        System.out.println("Color of house: " + house.getColor());

        System.out.println();
        System.out.println("Owner:");

        String name = house.getName();
        System.out.println("Name of the Owner: " + house.getName());

        String surname = house.getSurname();
        System.out.println("Surname of the Owner: " + house.getSurname());

        int age = house.getAge();
        System.out.println("Age of the Owner: " + house.getAge());
    }
}
