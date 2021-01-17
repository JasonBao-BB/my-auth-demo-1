package com.example.authorjdbc.service;

import com.example.authorjdbc.Entity.Permission;

import java.util.List;

public interface PermissionService {
    List<Permission> findAllByUserId(Long id);
}
