package com.sistemacliente.demo.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sistemacliente.demo.modelo.Cliente;
import com.sistemacliente.demo.repositorio.ClienteRepositorio;

@Service
public class ClienteServicio {
    private ClienteRepositorio repositorio;

    public List<Cliente> listarCliente(){
        return repositorio.findAll();
    }
    
    public boolean guardarCliente(){
        return repositorio.save(null);
    }

    public boolean eliminarCliente(){
        return repositorio.delete(null);
    }



}
