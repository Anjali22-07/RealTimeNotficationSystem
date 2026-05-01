package com.rtns.rtns.entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User {

     @Id()
     @GeneratedValue(strategy =GenerationType.IDENTITY)
     private Long Id;
     private String name;
     private String email;
}
