package com.adricodev.repositorioCRUD.ejercicio03;

import java.util.List;

public interface ProductoRepositorio {
     List<Producto> listar();
     Producto porId(int id);
     void guardar(Producto producto);
     void actualizar (Producto producto);
     void eliminar(int id);
}
