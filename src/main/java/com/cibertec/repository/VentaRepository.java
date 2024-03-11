package com.cibertec.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.model.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer> {
}