package org.qazdevelop.qazdevinfo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @JsonManagedReference
    @OneToOne
    @JoinColumn(name = "id")
    private WorkingHours workingHours;

//    @Column(name = "organization_id")
//    private Long organizationId;

    @JsonBackReference
//    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "id")
    private Organization organization;


    @Column(name = "name")
    private String name;
}
