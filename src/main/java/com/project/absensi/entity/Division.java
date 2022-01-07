package com.project.absensi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "division")
@Setter
@Getter
@NoArgsConstructor
public class Division extends BaseEntity<Division> {

    @Column(name = "name")
    private String name;

    @Column(name = "note", columnDefinition = "TEXT")
    private String note;
}
