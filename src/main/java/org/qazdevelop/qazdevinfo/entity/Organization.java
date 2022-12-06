package org.qazdevelop.qazdevinfo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "organization")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

//    @JsonIgnore
    @OneToOne(mappedBy = "organization",
            cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private Project project;
}
