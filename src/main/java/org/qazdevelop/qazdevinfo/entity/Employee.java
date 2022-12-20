package org.qazdevelop.qazdevinfo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date_of_hire")
    private Date dateOfHire;

    @Column(name = "date_of_dismissal")
    private Date dateOfDismissal;

    @Column(name = "reason_for_dismissal")
    private String reasonForDismissal;

    @Column(name = "photo")
    private String photo;

    @Column(name = "date_of_creation")
    private Date dateOfCreation;

    @Column(name = "date_of_update")
    private Date dateOfUpdate;

    @Column(name = "is_on_remote")
    private boolean isOnRemote;

    @Column(name = "note")
    private String note;

    @Column(name = "timezone")
    private String timezone;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "employee_relative",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "relative_id")
    )
    Set<Relative> relativeSet;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "employee_skill",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    Set<Skill> skillsSet;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "employee_position",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "position_id")
    )
    Set<Position> positionSet;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "employee_address",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id")
    )
    Set<Address> addressSet;
}
