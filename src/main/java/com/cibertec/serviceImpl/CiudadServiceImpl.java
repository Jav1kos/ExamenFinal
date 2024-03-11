package com.cibertec.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.Ciudad;
import com.cibertec.repository.CiudadRepository;
import com.cibertec.service.CiudadService;

import java.util.List;

@Service
public class CiudadServiceImpl implements CiudadService {

    @Autowired
    private CiudadRepository ciudadRepository;

    @Override
    public Ciudad guardarCiudad(Ciudad ciudad) {
        return ciudadRepository.save(ciudad);
    }

    @Override
    public List<Ciudad> obtenerTodasCiudades() {
        return ciudadRepository.findAll();
    }

    @Override
    public Ciudad obtenerCiudadPorCodigoPostal(String codigoPostal) {
        return ciudadRepository.findById(codigoPostal).orElse(null);
    }

    @Override
    public void eliminarCiudadPorCodigoPostal(String codigoPostal) {
        ciudadRepository.deleteById(codigoPostal);
    }
}
