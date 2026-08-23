package com.adricodev.repositorioCRUD.ejercicio02;

import java.util.List;

public interface ClienteRepositorio {
    List<Cliente> listar();
    Cliente porId(int id);
    void guardar(Cliente cliente);
    void eliminar(int id);
}
