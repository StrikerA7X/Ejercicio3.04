/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloCliente;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author TUF GAMING
 */
public class Producto {
       private int codigo;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    

    public Producto(int codigo, String nombre, String apellido, 
            LocalDate fechaNacimiento, Producto profesion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
      
    }

    public Producto(int codigo, String nombre, String apellido, 
            LocalDate fechaNacimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Producto() {
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getEdad(){
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

  

    
    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre + 
                ", apellido=" + apellido + ", fechaNacimiento=" + 
                fechaNacimiento.toString() + '}';
    }
}
