package net.ultrasist.capacitacion.arquitecturarest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import net.ultrasist.capacitacion.arquitecturarest.mappers.ProductMapper;
import net.ultrasist.capacitacion.arquitecturarest.pojos.Product;

@Service
@Primary
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper mapper;

    @Override
    public List<Product> getAll() {
        return mapper.getAll();
    }

    @Override
    public Product getByName(String name) {
        return mapper.getByName(name);
    }

    @Override
    public int insert(Product product) {
        if(this.getByName(product.getName()) == null) {
            mapper.insert(product);
            return 1;
        }
        return 0;
    }
}