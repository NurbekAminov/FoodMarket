package com.example.entity;

import com.example.entity.Base.IntegerBaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "email_history")
@Getter
@Setter
public class EmailHistoryEntity extends IntegerBaseEntity {
//    id, to_email, title, message, created_date

    @Column(name = "to_email")
    private String toEmail;

    @Column(name = "title")
    private String title;

    @Column(name = "message")
    private String message;



}
