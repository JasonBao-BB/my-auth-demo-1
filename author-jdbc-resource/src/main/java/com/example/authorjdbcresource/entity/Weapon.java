package com.example.authorjdbcresource.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "weapon")
public class Weapon implements Serializable {

    @Id
    private Integer id;

    private String name;

    @Column(name = "desciption")
    private String description;

    private String rare;
}
