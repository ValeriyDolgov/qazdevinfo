package org.qazdevelop.qazdevinfo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "contact_info")
public class ContactInfo {

    @Id
    @Column(name = "employee_id", insertable = false, updatable = false)
    private Long employee_id;


    @OneToOne
    @JsonBackReference
    @PrimaryKeyJoinColumn
    private Employee employee;

    @Column(name = "office_number")
    private String officeNumber;

    @Column(name = "personal_number")
    private String personalNumber;

    @Column(name = "office_email")
    private String officeEmail;

    @Column(name = "personal_email")
    private String personalEmail;

    @Column(name = "telegram_acc")
    private String telegramAccount;

    @Column(name = "skype_acc")
    private String skypeAccount;
}
