package com.adricodev.repositorioCRUD.ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepoImpl implements ClienteRepositorio{
    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public List<Cliente> listar() {
        return clientes;
    }

    @Override
    public Cliente porId(int id) {
        for(Cliente c : clientes){
            if(c.getId()==id){
                return c;
            }
        }
        return null;

    }

    @Override
    public void guardar(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void eliminar(int id) {
        clientes.remove(porId(id));
    }
}
