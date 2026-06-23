/**
Clase principal Empleado
 */

package com.llanquihuetour.model;

public class Persona {

    /**
    Atributos de la clase Persona
     */
    private String nombre;
    private int edad;
    private String rut;

    /**
     * Composicion de clase Direccion
     */
    private Direccion direccion;

    /**
     * Constructor clase Persona
     * @param nombre nombre persona
     * @param edad edad persona
     * @param rut rut persona
     * @param direccion direccion persona
     */
    public Persona(String nombre, int edad, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.direccion = direccion;
    }

    /**
     * Getters y Setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * To String()
     */
    @Override
    public String toString() {
        return "Persona" +
                "\nNombre: " + nombre +
                "\nEdad: " + edad +
                "\nRut: " + rut +
                "\n" + direccion
                ;}
    }
