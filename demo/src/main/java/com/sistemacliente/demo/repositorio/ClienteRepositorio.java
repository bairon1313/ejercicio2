package com.sistemacliente.demo.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sistemacliente.demo.modelo.Cliente;

@Repository
public class ClienteRepositorio {
    private List<Cliente>listaClientes;
    
    public ClienteRepositorio(){
        listaClientes=new ArrayList<>();
    }

    public List<Cliente> findAll(){
        return listaClientes;
    }

    public boolean save(String nombre){
        for (Cliente cliente : listaClientes) {
            if (cliente.getNombre().equals(nombre)) {
                 return listaClientes.add(cliente);
            }
           
            
        }
        return false;
    }

    public boolean delete(String nombre){
        for (Cliente cliente : listaClientes) {
            if (cliente.getNombre().equals(nombre)) {
                return listaClientes.remove(nombre);
            }

        }
        return false;

    }
    

    

}
