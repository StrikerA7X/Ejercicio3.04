/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicioCliente;

import java.util.List;
import modeloCliente.Factura;

/**
 *
 * @author TUF GAMING
 */
interface zFacturaSerivicio {
    public Factura crear(Factura factura);
    public Factura buscarPorCodigo(int facturaFactura);
    public List<Factura> listar();   
    
}
    

