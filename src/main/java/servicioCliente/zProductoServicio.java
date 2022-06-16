/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicioCliente;

import java.util.List;
import modeloCliente.Producto;

/**
 *
 * @author TUF GAMING
 */
public interface zProductoServicio {
        public Producto crear(Producto persona);
    public List<Producto> listar();
    public Producto buscarPorCodigo(int codigo);
    public Producto eliminar(int codigo);
    
    
}
    

