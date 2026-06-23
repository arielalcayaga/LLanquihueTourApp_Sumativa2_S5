/**
 * Clase Utilizada para crear coleccion Proveedor
 */
package com.llanquihuetour.model;

public class Proveedor {
    /**
     * Atributos clase Proveedor
     */
    private String nombreProveedor;
    private String categoriaProveedor;
    private int mesesConEmpresa;

    /**
     * Constructor clase Proveedor
     * @param nombreProveedor nombre proveedor
     * @param categoriaProveedor categoria proveedor
     * @param mesesConEmpresa meses trabajando con empresa proveedor
     */
    public Proveedor(String nombreProveedor, String categoriaProveedor, int mesesConEmpresa) {
        this.nombreProveedor = nombreProveedor;
        this.categoriaProveedor = categoriaProveedor;
        this.mesesConEmpresa = mesesConEmpresa;
    }

    /**
     * Getters y Setters
     * @return
     */
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getCategoriaProveedor() {
        return categoriaProveedor;
    }

    public void setCategoriaProveedor(String categoriaProveedor) {
        this.categoriaProveedor = categoriaProveedor;
    }

    public int getMesesConEmpresa() {
        return mesesConEmpresa;
    }

    public void setMesesConEmpresa(int mesesConEmpresa) {
        this.mesesConEmpresa = mesesConEmpresa;
    }

    /**
     * To String()
     */
    @Override
    public String toString() {
        return "Proveedor" +
                "\nNombre: " + nombreProveedor +
                "\nCategoría: " + categoriaProveedor +
                "\nMeses trabajando con la Empresa: " + mesesConEmpresa +
                "\n"
                ;}
}
