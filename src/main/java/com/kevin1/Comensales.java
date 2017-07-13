package com.kevin1;

/**
 * Created by alumno on 12/07/2017.
 */
public class Comensales {

private String Nombre;
private String Apellido;
private int Cantidad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public Comensales(String nombre, String apellido, int cantidad) {
        Nombre = nombre;
        Apellido = apellido;
        Cantidad = cantidad;




    }
}
