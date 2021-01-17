package com.example.authorjdbc.repository;

import com.example.authorjdbc.Entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.NamedNativeQuery;
import java.util.List;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
    @Modifying
    @Query(value = "select p.* from tb_user as u " +
            "left join tb_user_role as ur on u.id = ur.user_id " +
            "left join tb_role as r on r.id = ur.role_id " +
            "left join tb_role_permission as rp on r.id = rp.role_id " +
            "left join tb_permission as p on p.id = rp.permission_id " +
            "where u.id = ?1", nativeQuery = true)
    List<Permission> findAllByUserId(Long id);
}
