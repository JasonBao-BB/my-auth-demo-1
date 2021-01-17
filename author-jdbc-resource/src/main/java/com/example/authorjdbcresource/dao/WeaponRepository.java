package com.example.authorjdbcresource.dao;

import com.example.authorjdbcresource.entity.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;

public interface WeaponRepository extends JpaRepository<Weapon, Integer> {
    Weapon findByName(String name);
}
