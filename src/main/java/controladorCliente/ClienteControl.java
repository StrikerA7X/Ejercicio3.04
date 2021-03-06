/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorCliente;

import java.util.List;
import modeloCliente.Cliente;
import servicioCliente.ClienteServicio;


/**
 *
 * @author TUF GAMING
 */
public class ClienteControl {
    
    private final ClienteServicio clienteServicio = new ClienteServicio();
   
    
    public Cliente crear(String [] args){
       
        var cliente = new Cliente(Integer.valueOf(args[0]),args[1],args[2]);
        this.clienteServicio.crear(cliente);
        return cliente;
    }
    
    public List<Cliente> listar(){
        return this.clienteServicio.listar();
    }
    
}

    