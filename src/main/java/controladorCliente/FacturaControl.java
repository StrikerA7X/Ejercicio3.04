/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorCliente;

import java.util.List;
import modeloCliente.Factura;
import servicioCliente.FacturaServicio;


/**
 *
 * @author TUF GAMING
 */
public class FacturaControl {
   private final FacturaServicio facturaServicio = new FacturaServicio();
    
    public Factura crear(String [] args){
        var factura= new Factura(Integer.valueOf(args[0]),args[1],args[2]);
        this.facturaServicio.crear(factura);
        return factura;
    }
    
    public List<Factura> listar(){
        return this.facturaServicio.listar();
    }
    
}

