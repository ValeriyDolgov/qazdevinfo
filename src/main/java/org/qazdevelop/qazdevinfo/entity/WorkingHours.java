package org.qazdevelop.qazdevinfo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@Table(name = "working_hours")
public class WorkingHours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    //Foreign Key
//    @Column(name = "project_id")
//    private Long projectId;

    @OneToOne
    @JsonBackReference
    private Project project;

    @Column(name = "working_date")
    private Date workingDate;

    @Column(name = "start_time")
    private Timestamp startTime;

    @Column(name = "end_time")
    private Timestamp endTime;

    @Column(name = "total_time")
    private String totalTime;
}
