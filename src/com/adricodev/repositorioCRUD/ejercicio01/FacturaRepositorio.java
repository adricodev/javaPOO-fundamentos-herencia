package com.adricodev.repositorioCRUD.ejercicio01;

import java.util.List;

public interface FacturaRepositorio {
    List<Factura> listar();
    Factura porId(int id);
    void guardar(Factura factura);
    void eliminar(int id);
}
