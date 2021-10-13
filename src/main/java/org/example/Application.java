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
        House house = new House("Me", 9, "white");
        house.setOwner("Neighbor");
        System.out.println(house.getOwner());
        System.out.println(house.getNumFloor());
        System.out.println(house.getAddress());
        System.out.println(house.getColor());

        Owner owner = new Owner("Irina", "Petukhova");
        owner.setName("Masha");
        owner.setSurname("Petrova");
        System.out.println(owner.getName());
        System.out.println(owner.getSurname());
        System.out.println(owner.getAge());
    }
}
