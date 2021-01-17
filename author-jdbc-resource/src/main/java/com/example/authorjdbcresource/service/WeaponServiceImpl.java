package com.example.authorjdbcresource.service;

import com.example.authorjdbcresource.dao.WeaponRepository;
import com.example.authorjdbcresource.entity.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeaponServiceImpl implements WeaponService{

    @Autowired
    private WeaponRepository weaponRepository;

    @Override
    public List<Weapon> findAll() {

        List<Weapon> weapons = weaponRepository.findAll();
        for (Weapon weapon : weapons) {
            System.out.println(weapon.getName());
        }
        return weapons;
    }

    @Override
    public Weapon findById(Integer id) {
        return weaponRepository.findById(id).orElse(null);
    }

    @Override
    public Weapon findByName(String name) {
        return weaponRepository.findByName(name);
    }
}
