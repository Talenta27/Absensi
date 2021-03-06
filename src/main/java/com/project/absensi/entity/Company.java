package com.project.absensi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "company")
@Setter
@Getter
@NoArgsConstructor


public class Company extends BaseEntity<Company>{

    @Column(name = "address", columnDefinition = "VARCHAR(100)")
    private String address;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "name", columnDefinition = "VARCHAR(100)")
    private String name;

    @Column(name = "phone", columnDefinition = "VARCHAR(30)")
    private String phone;
}
