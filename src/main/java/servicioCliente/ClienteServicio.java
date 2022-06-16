/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicioCliente;

import java.util.ArrayList;
import java.util.List;
import modeloCliente.Cliente;

/**
 *
 * @author TUF GAMING
 */
public class ClienteServicio implements zClienteServicio {
        private static final List<Cliente> clienteList = new ArrayList<>();

        @Override
    public Cliente crear(Cliente cliente) {
            boolean add = ClienteServicio.clienteList.add(cliente);
        return cliente;
    }

        @Override
    public Cliente modificar(int codigoBarco, Cliente clienteNuevo) {
            int codigoCliente = 0;
        var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoCliente));
        this.listar().get(posicion).setColor(clienteNuevo.getColor());
        this.listar().get(posicion).setNombre(clienteNuevo.getNombre());
        this.listar().get(posicion).setPlaca(clienteNuevo.getPlaca());
        this.listar().get(posicion).setCapitan(clienteNuevo.getFactura());
        return clienteNuevo;
    }

        @Override
    public Cliente eliminar(int codigoCliente) {
        Cliente cliente=this.buscarPorCodigo(codigoCliente);
            Cliente Cliente = null;
        var posicion=this.buscarPosicion(Cliente);
        this.listar().remove(posicion);
        return cliente;
    }

        @Override
    public Cliente buscarPorCodigo(int codigoCliente) {
        Cliente cliente=null;
        for(var b:ClienteServicio.clienteList){
            int codigocliente = 0;
            if(codigocliente==b.getCodigo()){
                cliente=b;
                break;
            }
        }
        return cliente;
    }

        @Override
    public List<Cliente> listar() {
        return ClienteServicio.clienteList;
    }

        @Override
    public int buscarPosicion(Cliente cliente) {
        int posicion=-1;
        for(var b:ClienteServicio.clienteList){
            posicion++;
            if(b.getCodigo()==cliente.getCodigo()){
                break;
            }
        }
        return posicion;
    }
    
}

    

