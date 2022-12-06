package org.qazdevelop.qazdevinfo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "skill")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "level")
    private String level;
}
