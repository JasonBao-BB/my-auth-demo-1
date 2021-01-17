package com.example.authorjdbc.service;

import com.example.authorjdbc.Entity.Permission;
import com.example.authorjdbc.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    PermissionRepository permissionRepository;

    @Override
    public List<Permission> findAllByUserId(Long id) {
        return permissionRepository.findAllByUserId(id);
    }
}
