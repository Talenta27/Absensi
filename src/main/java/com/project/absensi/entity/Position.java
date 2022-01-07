package com.project.absensi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "position")
@Setter
@Getter
@NoArgsConstructor
public class Position extends BaseEntity<Position>{

    @Column(name = "name")
    private String name;

    @Column(name = "note", columnDefinition = "TEXT")
    private String note;
}
