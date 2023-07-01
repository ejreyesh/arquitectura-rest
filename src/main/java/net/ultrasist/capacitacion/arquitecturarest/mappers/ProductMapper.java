package net.ultrasist.capacitacion.arquitecturarest.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import net.ultrasist.capacitacion.arquitecturarest.pojos.Product;

@Repository
public interface ProductMapper {
    final String columns = "product_pk, name, description, price, stock, active";

    @Results(id = "ProductMap", value = {
            @Result(property = "id", column = "product_pk")
    })
    @Select("SELECT " + columns + " FROM product")
    public List<Product> getAll();

    @ResultMap("ProductMap")
    @Select("SELECT " + columns + " FROM product WHERE name=#{name}")
    public Product getByName(String name);

    @ResultMap("ProductMap")
    @Insert("INSERT INTO product VALUES(0, #{name}, #{description}, #{price}, #{stock}, #{active})")
    public int insert(Product product);

}