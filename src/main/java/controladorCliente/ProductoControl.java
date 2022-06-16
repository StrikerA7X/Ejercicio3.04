/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorCliente;

import java.time.LocalDate;
import modeloCliente.Producto;
import servicioCliente.ProductoServicio;

/**
 *
 * @author TUF GAMING
 */
public class ProductoControl {
    
    private final ProductoServicio productoServicio = new ProductoServicio();
    
    public Producto crear(String [] params) {
        var fechaNacimiento = LocalDate.of(Integer.valueOf(params[3]),
                Integer.valueOf(params[4]), 
                Integer.valueOf(params[5]));  
        Producto producto = null;
       
        return producto;
    }
    
    public Object listar() {
        return this.productoServicio.listar();
    }

}

