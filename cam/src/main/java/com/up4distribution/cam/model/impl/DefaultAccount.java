package com.up4distribution.cam.model.impl;

import org.springframework.data.cassandra.mapping.Table;

import com.up4distribution.cam.model.Account;
import com.up4distribution.core.cassandra.model.AbstractEntity;

import lombok.Getter;
import lombok.Setter;

@Table(value = "accounts")
@Setter
@Getter
public class DefaultAccount extends AbstractEntity implements Account {
    private String email;
    private String firstName;
    private String lastName;
    private String middleName;
    private String streetLine1;
    private String streetLine2;
    private String city;
    private String zipCode;
    private String phoneNumber1;
    private String phoneNumber2;
    private String phoneNumber3;
    private String fax;
}
