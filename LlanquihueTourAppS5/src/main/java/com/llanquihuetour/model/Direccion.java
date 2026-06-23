/**
 Clase con composición Direccion
 */

package com.llanquihuetour.model;

public class Direccion {

    /**
     * Atributos clase Direccion
     */
    private String nombreCalle;
    private int numeroCasa;
    private String comuna;

    /**
     *Constructor clase Direccion
     * @param nombreCalle nombre de calle persona
     * @param numeroCasa numero de casa persona
     * @param comuna comuna en cual vive persona
     */
    public Direccion(String nombreCalle, int numeroCasa, String comuna) {
        this.nombreCalle = nombreCalle;
        this.numeroCasa = numeroCasa;
        this.comuna = comuna;
    }

    /**
     * Getters y Setters
     */
    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    /**
     * To String()
     */
    @Override
    public String toString() {
        return "\nDirección" +
                "\nNombre Calle: " + nombreCalle +
                "\nNúmero Casa: " + numeroCasa +
                "\nComuna: " + comuna +
                "\n"
                ;}
    }
