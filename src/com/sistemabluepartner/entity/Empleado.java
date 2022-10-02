package com.sistemabluepartner.entity;

/**
 *
 * @author Tarcisio
 */
public class Empleado {

    private int idEmpleado;
    private String nombres;
    private String direccion;
    private String telefono;
    private String documento;
    private String nombresPaterno;
    private String nombresMaterno;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombres, String direccion, String telefono, String documento, String nombresPaterno, String nombresMaterno) {
        this.idEmpleado = idEmpleado;
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefono = telefono;
        this.documento = documento;
        this.nombresPaterno = nombresPaterno;
        this.nombresMaterno = nombresMaterno;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombresPaterno() {
        return nombresPaterno;
    }

    public void setNombresPaterno(String nombresPaterno) {
        this.nombresPaterno = nombresPaterno;
    }

    public String getNombresMaterno() {
        return nombresMaterno;
    }

    public void setNombresMaterno(String nombresMaterno) {
        this.nombresMaterno = nombresMaterno;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombres=" + nombres + ", direccion=" + direccion + ", telefono=" + telefono + ", documento=" + documento + ", nombresPaterno=" + nombresPaterno + ", nombresMaterno=" + nombresMaterno + '}';
    }
    
    
}
