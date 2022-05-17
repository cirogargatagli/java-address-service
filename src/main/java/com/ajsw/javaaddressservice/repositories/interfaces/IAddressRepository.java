package com.ajsw.javaaddressservice.repositories.interfaces;

import com.ajsw.javaaddressservice.models.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Integer> {
}
