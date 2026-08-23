package com.adricodev.repositorioCRUD.ejercicio03;

import java.util.ArrayList;
import java.util.List;

public class ProductoRepoImpl implements ProductoRepositorio{
    private List<Producto> productos = new ArrayList<>();

    @Override
    public List<Producto> listar() {
        return productos;
    }

    @Override
    public Producto porId(int id) {
        for(Producto p : productos){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    @Override
    public void guardar(Producto producto) {
        productos.add(producto);

    }

    @Override
    public void actualizar(Producto producto) {
        Producto guardado = porId(producto.getId());
        if(guardado != null){
            guardado.setNombre(producto.getNombre());
            guardado.setPrecio(producto.getPrecio());
            guardado.setStock(producto.getStock());
        }
    }

    @Override
    public void eliminar(int id) {
        productos.remove(porId(id));
    }
}
