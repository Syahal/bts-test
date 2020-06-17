package com.bts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bts.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
