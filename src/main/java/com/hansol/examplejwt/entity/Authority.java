package com.hansol.examplejwt.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authority")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Authority {

    @Id
    @Column(name = "authority_name", length = 50)
    private String authorityName;
}
