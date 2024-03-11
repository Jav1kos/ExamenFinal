package com.cibertec.service;

import java.util.List;

import com.cibertec.model.DetalleVenta;

public interface DetalleVentaService {
    DetalleVenta guardarDetalleVenta(DetalleVenta detalleVenta);
    List<DetalleVenta> obtenerTodosDetallesVenta();
    DetalleVenta obtenerDetalleVentaPorId(int id);
    void eliminarDetalleVentaPorId(int id);
}
