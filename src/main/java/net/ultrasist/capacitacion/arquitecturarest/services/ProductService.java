package net.ultrasist.capacitacion.arquitecturarest.services;

import java.util.List;

import net.ultrasist.capacitacion.arquitecturarest.pojos.Product;

public interface ProductService {

    /**
     * Método para listar todos los productos almacenados en la base de datos
     * @return  Lista de productos
     */
    List<Product> getAll();

    /**
     * Método para buscar un producto por su nombre
     * @param name  Nombre del producto
     * @return      Producto buscado
     */
    Product getByName(String name);

    /**
     * Método para insertar un nuevo producto en la base de datos
     * @param product   Producto a insertar
     * @return          Número entero que indica si se guardo o no el producto
     */
    int insert(Product product);

}