package com.boraji.tutorial.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

//import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "USER_TBL")
public class User {

   @Id
   @GeneratedValue
   @Column(name = "UID")
   private Long id;

   @Column(name = "NAME")
   @Size(max = 20, min = 3, message = "{user.name.invalid}")
   private String name;

   @Column(name = "EMAIL", unique = true)
//   @Email(message = "{user.email.invalid}")
   private String email;

   //Getter and Setter methods
   //...
}
