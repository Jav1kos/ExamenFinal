package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.model.Ciudad;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, String> {
}
