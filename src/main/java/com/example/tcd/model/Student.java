package com.example.tcd.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="students")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Student {

    private int id;
    private String name;
    private String city;
    private String college;
}
