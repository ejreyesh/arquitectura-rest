package net.ultrasist.capacitacion.arquitecturarest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ultrasist.capacitacion.arquitecturarest.pojos.Product;
import net.ultrasist.capacitacion.arquitecturarest.services.ProductService;

@RestController
@RequestMapping(value = "/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/findall", produces = "application/json; charset=utf-8")
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping(value = "/findName/{name}", produces = "application/json; charset=utf-8")
    public Product findByName(@PathVariable String name) {
        return productService.getByName(name);
    }

    @PostMapping(value = "/newproduct", produces = "application/json; charset=utf-8")
    public int insert(@RequestBody Product product) {
        return productService.insert(product);
    }
}