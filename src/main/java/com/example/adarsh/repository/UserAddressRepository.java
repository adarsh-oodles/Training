package com.example.adarsh.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.adarsh.domain.UserAddress;

public interface UserAddressRepository extends JpaRepository<UserAddress, Serializable> {

}
