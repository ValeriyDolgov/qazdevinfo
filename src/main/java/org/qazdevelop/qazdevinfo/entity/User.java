package org.qazdevelop.qazdevinfo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "surname")
    private String surname;

    @Column(name = "name")
    private String name;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "password")
    private String password;

    @Column(name = "sex")
    private String sex;

    //Foreign key
    @Column(name = "employee_id")
    private Long employeeId;
}
