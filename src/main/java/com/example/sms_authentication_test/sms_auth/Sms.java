package com.example.sms_authentication_test.sms_auth;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Sms {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "sms_key")
    private String smsKey;

    public Sms(String to, String smsConfirmNum) {
        this.phoneNumber = to;
        this.smsKey = smsConfirmNum;
    }
}
