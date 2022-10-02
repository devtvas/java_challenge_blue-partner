package com.sistemabluepartner.db;

public class TestConexion {
    public static void main(String[] args) {
        Conexion c = new Conexion();
        c.getConexion();
        c.getDesconexion();
    }
}
