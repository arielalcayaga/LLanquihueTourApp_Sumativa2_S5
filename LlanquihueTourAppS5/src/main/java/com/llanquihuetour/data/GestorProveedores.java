package com.llanquihuetour.data;

import com.llanquihuetour.model.Proveedor; // Importa la clase Proveedor desde el paquete model
import java.util.*; // Importa utilidades como ArrayList
import java.io.*; // Importa clases para leer archivos
import org.apache.poi.xssf.usermodel.*; // Importa clases para trabajar con archivos Excel .xlsx

    public class GestorProveedores { // Clase que gestiona una lista de proveedores no usages
        private List<Proveedor> lista = new ArrayList<>(); // Lista que almacena los proveedores cargados

        public void agregar(Proveedor prov) { // Método para agregar un empleado a la lista
            lista.add(prov); // Agrega el objeto a la colección
        }

        public void listarTodos() { // Muestra todos los proveedores de la lista
            for (Proveedor prov : lista) { // Recorre cada proveedor
                System.out.println(prov); // Imprime su información
            }
        }

        public List<Proveedor> buscarCategoriaProveedor(String categoriaProveedor) { // Busca los proveedores que coinciden con un criterio
            List<Proveedor> resultado = new ArrayList<>(); // Lista para guardar coincidencias
            for (Proveedor prov : lista) { // Recorre los proveedores
                if (prov.getCategoriaProveedor().equalsIgnoreCase(categoriaProveedor)) { // Devuelve los proveedores que coinciden con un criterio
                    resultado.add(prov); // Agrega los que coinciden
                }
            }
            return resultado; // Devuelve la Lista encontrada
        }

        public void cargarDesdeExcel(String ruta) { // Carga proveedores desde un archivo Excel
            try (FileInputStream fis = new FileInputStream(ruta)) { // Abre el archivo Excel
                XSSFWorkbook libro = new XSSFWorkbook(fis); // Crea el objeto libro desde el archivo
                XSSFSheet hoja = libro.getSheetAt(0); // Accede a la primera hoja del Excel

                for (int i = 1; i <= hoja.getLastRowNum(); i++) { // Recorre desde la segunda fila (índice 1)
                    var fila = hoja.getRow(i); // Obtiene la fila actual

                    String nombreProveedor = fila.getCell(0).getStringCellValue(); // Lee el nombre Proveedor de la columna 0
                    String categoriaProveedor = fila.getCell(1).getStringCellValue(); // Lee la categoría proveedor de la columna 1
                    int mesesConEmpresa = (int) fila.getCell(2).getNumericCellValue(); // Lee cuantos meses lleva trabajando la empresa con el proveedor de la columna 2

                    agregar(new Proveedor(nombreProveedor, categoriaProveedor, mesesConEmpresa)); // Crea y agrega el proveedor a la lista
                }

                libro.close(); // Cierra el libro Excel
            } catch (Exception e) { // Captura errores (como archivo no encontrado o mal formato)
                System.out.println("Error al Leer Excel: " + e.getMessage()); // Muestra mensaje de error
            }
        }
    }