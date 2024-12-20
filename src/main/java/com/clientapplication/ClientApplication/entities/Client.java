package com.clientapplication.ClientApplication.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

public class Client {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;

    private Client(){

    }

    public Client(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
