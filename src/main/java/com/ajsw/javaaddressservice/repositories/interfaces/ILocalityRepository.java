package com.ajsw.javaaddressservice.repositories.interfaces;

import com.ajsw.javaaddressservice.models.entities.Locality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILocalityRepository extends JpaRepository<Locality, Integer> {
}
