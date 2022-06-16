/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloCliente;

/**
 *
 * @author TUF GAMING
 */
public class Cliente {
     private int codigo;
    private String nombre;
    private String color;
    private String placa;
    private Factura factura;

    public Cliente(int codigo, String nombre, String color, String placa, 
            Factura factura) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.color = color;
        this.placa = placa;
        this.factura = factura;
    }

    public Cliente(int codigo, String nombre, String color, String placa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.color = color;
        this.placa = placa;
    }

    public Cliente(Integer valueOf, String arg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Cliente(Integer valueOf, String arg, String arg0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setCapitan(Factura factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "Barco{" + "codigo=" + codigo + ", nombre=" + nombre + 
                ", color=" + color + ", placa=" + placa + ", capitan=" + 
                factura.toString() + '}';
    
}

  
}
