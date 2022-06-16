/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicioCliente;

import java.util.ArrayList;
import java.util.List;
import modeloCliente.Factura;

/**
 *
 * @author TUF GAMING
 */
public class FacturaServicio implements zFacturaSerivicio {

 private static final List<Factura> facturaList = new ArrayList<>();

 @Override
    public Factura crear(Factura factura) {
        FacturaServicio.facturaList.add(factura);
        return factura;
    }
    
 @Override
    public List<Factura> listar(){
        return FacturaServicio.facturaList;
    }

 @Override
    public Factura buscarPorCodigo(int codigoFactura) {
            Factura capitan=null;
        for(var c:FacturaServicio.facturaList){
            if(codigoFactura==c.getCodigo()){
                Factura factura = c;
                break;
            }
        }
     Factura factura = null;
        return factura;
    }

}
