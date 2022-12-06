package org.qazdevelop.qazdevinfo.entity;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "country")
    private String country;

    @Column(name = "region")
    private String region;

    @Column(name = "city")
    private String city;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "apartment_number")
    private int apartmentNumber;

    @Column(name = "is_current")
    private boolean isCurrent;

    @Column(name = "is_registered")
    private boolean isRegistered;

}
