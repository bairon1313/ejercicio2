package com.sistemacliente.demo.controlador;



import com.sistemacliente.demo.modelo.Cliente;
import com.sistemacliente.demo.servicio.ClienteServicio;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("/api/v1")

public class ClienteControlador {

    private  ClienteServicio servicio;

    @GetMapping("/clientes")
    public List<Cliente> listarTodosLosClientes(@RequestParam String param) {
        return servicio.listarCliente();
    }

    @PostMapping("/clientes")
    public boolean agregarCliente(@RequestBody String entity) {
        return servicio.guardarCliente();
    }

    @DeleteMapping("clientes/{id}")
    public boolean putMethodName(@PathVariable String id, @RequestBody String entity) {
        return servicio.eliminarCliente();
    }
    
    



}
