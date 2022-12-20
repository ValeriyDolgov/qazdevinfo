package org.qazdevelop.qazdevinfo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "position")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "level")
    private String level;

//    @Enumerated(EnumType.STRING)
//    @Column(name = "rank")
//    private Rank rank;
    @Column(name = "rank")
    private int rank;
}
