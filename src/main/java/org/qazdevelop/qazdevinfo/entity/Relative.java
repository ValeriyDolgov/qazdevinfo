package org.qazdevelop.qazdevinfo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "relative")
public class Relative {

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

    @Column(name = "relation")
    private String relation;

    @Column(name = "phone_number")
    private String phoneNumber;

//    @ManyToMany(mappedBy = "relativeSet")
//////    @JsonIgnore
//////    @JsonBackReference
//    Set<Employee> employee;
}
