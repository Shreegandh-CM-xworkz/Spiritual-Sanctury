package com.xworks.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="email")
@Data
public class EmailEntity {
    @Id
    @Column(name="id")
    private int id;

    public EmailEntity(String address, String sender, String reciever, String subject, String cc, String status) {
        this.address = address;
        this.sender = sender;
        this.reciever = reciever;
        this.subject = subject;
        this.cc = cc;
        this.status = status;
    }

    @Column(name="address")
    private String address;
    @Column(name="sender")
        private String sender;
    @Column(name="reciever")
    private String reciever;
    @Column(name="subject")
    private String subject;
    @Column(name="cc")
    private String cc;
    @Column(name="status")
    private String status;

}
