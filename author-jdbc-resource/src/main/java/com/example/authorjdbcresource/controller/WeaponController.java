package com.example.authorjdbcresource.controller;

import com.example.authorjdbcresource.entity.Weapon;
import com.example.authorjdbcresource.service.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/weapon")
public class WeaponController {

    @Autowired
    WeaponService weaponService;

    @GetMapping(value = "")
    @PreAuthorize("hasAnyRole('USER')")
    public ResponseEntity<List<Weapon>> findAllWeapons(){
        return new ResponseEntity<>(weaponService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Weapon> findById(@PathVariable("id") Integer id){
        return new ResponseEntity<>(weaponService.findById(id), HttpStatus.OK);
    }

}
