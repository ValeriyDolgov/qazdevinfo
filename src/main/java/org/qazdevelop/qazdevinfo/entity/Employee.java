package org.qazdevelop.qazdevinfo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
//@Embeddable
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

    @OneToOne
    @JsonManagedReference
    @JoinColumn(name = "id")
    private ContactInfo info;
}
