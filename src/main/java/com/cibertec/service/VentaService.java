package com.cibertec.service;


import java.util.List;

import com.cibertec.model.Venta;

public interface VentaService {
    Venta guardarVenta(Venta venta);
    List<Venta> obtenerTodasVentas();
    Venta obtenerVentaPorId(int id);
    void eliminarVentaPorId(int id);
}
