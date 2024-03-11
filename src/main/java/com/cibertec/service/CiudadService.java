package com.cibertec.service;

import java.util.List;

import com.cibertec.model.Ciudad;

public interface CiudadService {
    Ciudad guardarCiudad(Ciudad ciudad);
    List<Ciudad> obtenerTodasCiudades();
    Ciudad obtenerCiudadPorCodigoPostal(String codigoPostal);
    void eliminarCiudadPorCodigoPostal(String codigoPostal);
}
