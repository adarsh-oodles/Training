package com.example.adarsh.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.adarsh.domain.Security;

public interface SecurityRepository extends JpaRepository<Security, Serializable> {

}
