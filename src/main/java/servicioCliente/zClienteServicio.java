/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicioCliente;

import java.util.List;
import modeloCliente.Cliente;

/**
 *
 * @author TUF GAMING
 */
public interface zClienteServicio {
    
    public Cliente crear(Cliente barco);
    public Cliente modificar(int codigoCliente, Cliente clienteNuevo);
    public Cliente eliminar(int codigoCliente);
    public Cliente buscarPorCodigo(int codigoCliente);
    public int buscarPosicion(Cliente cliente);
    public List<Cliente> listar(); 
    
    
}
