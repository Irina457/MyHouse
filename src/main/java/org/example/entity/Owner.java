package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Owner {
    private final String name;
    private String surname;
    private int age;
}
