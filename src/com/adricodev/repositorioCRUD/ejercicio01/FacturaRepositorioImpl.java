package com.adricodev.repositorioCRUD.ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class FacturaRepositorioImpl implements FacturaRepositorio {
    private List<Factura> facturas = new ArrayList<>();

    @Override
    public List<Factura> listar() {
        return facturas;
    }

    @Override
    public Factura porId(int id) {
        for(Factura f : facturas){
            if(f.getId() == id){
                return f;
            }
        }
        return null;
    }

    @Override
    public void guardar(Factura factura) {
        facturas.add(factura);
    }

    @Override
    public void eliminar(int id) {
        Factura f = porId(id);
        facturas.remove(f);
    }
}
