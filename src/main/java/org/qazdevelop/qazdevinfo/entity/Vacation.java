package org.qazdevelop.qazdevinfo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "vacation")
public class Vacation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    //Foreign key
    @Column(name = "employee_id")
    private Long employeeId;

    //Foreign key
    @Column(name = "replacement_user_id")
    private Long replacementUserId;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "update_date")
    private Date updateDate;
}
