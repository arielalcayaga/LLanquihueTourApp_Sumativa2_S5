package com.llanquihuetour.ui;

import com.llanquihuetour.data.GestorProveedores;
import com.llanquihuetour.model.Proveedor;

public class Main {
    public static void main(String[] args) {

        GestorProveedores gestor = new GestorProveedores();

                // Cargar los datos desde el archivo Excel
                gestor.cargarDesdeExcel("src/main/resources/proveedores.xlsx");

                System.out.println("Todos los Proveedores:\n");
                gestor.listarTodos();

                System.out.println("Proveedores de Alimentos:\n");
                for (Proveedor prov : gestor.buscarCategoriaProveedor("alimentos")) {
                    System.out.println(prov);
                }
            }
        }