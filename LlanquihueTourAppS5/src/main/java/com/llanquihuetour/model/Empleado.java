/**
 Clase con herencia Empleado
 */

package com.llanquihuetour.model;

public class Empleado extends Persona {

    /**
     * Atributos propios clase Empleado
     */
    private String cargo;
    private String jerarquia;
    private int sueldo;

    /**
     * Constructor clase empleado
     * @param nombre nombre empleado
     * @param edad edad empleado
     * @param rut rut empleado
     * @param direccion direccion empleado
     * @param cargo cargo empleado
     * @param jerarquia jerarquia empleado
     * @param sueldo sueldo en pesos empleado
     */
    public Empleado(String nombre, int edad, String rut, Direccion direccion, String cargo, String jerarquia, int sueldo) {
        super(nombre, edad, rut, direccion);
        this.cargo = cargo;
        this.jerarquia = jerarquia;
        this.sueldo = sueldo;
    }

    /**
     * Getters y Setters
     */
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getJerarquia() {
        return jerarquia;
    }

    public void setJerarquia(String jerarquia) {
        this.jerarquia = jerarquia;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * To String()
     */
    @Override
    public String toString() {
        return "Empleado" +
                "\nNombre: " + getNombre() +
                "\nEdad: " + getEdad() +
                "\nRut: " + getRut() +
                 "\n" + getDireccion() +
                "\nCargo: " + cargo +
                "\nJerarquia: " + jerarquia +
                "\nSueldo: " + sueldo +
                "\n" ;}
    }