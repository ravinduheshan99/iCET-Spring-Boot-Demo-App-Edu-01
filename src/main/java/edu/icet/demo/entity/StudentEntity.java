package edu.icet.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data //Annotation fot getters setters and etc
@ToString //Annotaion to override toString()
@AllArgsConstructor //Annotation for allArgsConstructor
@NoArgsConstructor //Annotation for noArgsConstructor
@Entity //consider the class as entity
@Table(name = "student") //table name that we want to create in the database
public class StudentEntity {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //key is generated automatically
    private Integer studentId;

    private String firstName;
    private String lastName;
    private String age;
}
