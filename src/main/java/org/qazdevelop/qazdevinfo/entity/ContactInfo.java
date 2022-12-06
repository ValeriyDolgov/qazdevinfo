package org.qazdevelop.qazdevinfo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "contact_info")
public class ContactInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeId;

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
