package com.javatode.api.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Document(collection = "authors")
public class Author {
    @Id
    private String id;
    private String name;
    private Integer age;

    public Author(String id) {
        this.id = id;
    }

    public Author(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
