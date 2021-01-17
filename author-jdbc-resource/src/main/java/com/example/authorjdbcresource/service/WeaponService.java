package com.example.authorjdbcresource.service;

import com.example.authorjdbcresource.entity.Weapon;

import java.util.List;

public interface WeaponService {
    List<Weapon> findAll();
    Weapon findById(Integer id);
    Weapon findByName(String name);
}
