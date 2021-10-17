package org.example;
/*
Создать 3 класса - Application, House, Owner
В каждом классе должны быть и изменяемые, и неизменяемые поля, все поля - приватные
У дома есть один владелец, количество этажей, адрес и цвет
У владельца есть имя, фамилия, возраст
Дом может выдать владельца, выдать остальные свои поля
Владелец может представиться (рассказать о себе)
Необходимо в методе main создать дом и вывести на печать информацию о его владельце
*/
import org.example.entity.House;
import org.example.entity.Owner;

public class Application {
    public static void main(String[] args){
        Owner owner = new Owner("Masha","Petrova", 20);
        House house = new House(9, "Pushkinskaya, 243", "white", owner);

        System.out.println("House and its owner: ");
        System.out.println("House:");

        System.out.println("Number of floors: " + house.getNumFloor());
        System.out.println("Address: " + house.getAddress());
        System.out.println("Color of house: " + house.getColor());

        System.out.println();
        System.out.println("Owner:");

        System.out.println("Name of the Owner: " + house.getName());
        System.out.println("Surname of the Owner: " + house.getSurname());
        System.out.println("Age of the Owner: " + house.getAge());
    }
}