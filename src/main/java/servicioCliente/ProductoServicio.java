/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicioCliente;

import java.util.ArrayList;
import java.util.List;
import modeloCliente.Producto;

/**
 *
 * @author TUF GAMING
 */
public class ProductoServicio implements zProductoServicio {
       private static final List<Producto> productoList = new ArrayList<>();
    
       @Override
    public Producto crear(Producto persona) {
        ProductoServicio.productoList.add(persona);
           Producto producto = null;
        return producto;
    }

       @Override
    public List<Producto> listar() {
        return ProductoServicio.productoList;
    }

   
       @Override
    public Producto buscarPorCodigo(int i) {
        var producto = new Producto();
        for(Producto per:ProductoServicio.productoList){
            if(per.getCodigo()==i){
                producto=per;
                break;
            }
        }
        return producto;}

       @Override
    public Producto eliminar(int codigo) {
        var producto = this.buscarPorCodigo(codigo);
        ProductoServicio.productoList.remove(producto);
        return producto;
    }
    
} 

