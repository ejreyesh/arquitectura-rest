package net.ultrasist.capacitacion.arquitecturarest.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Integer id;
    private String name;
    private String description;
    private Float price;
    private Integer stock;
    private Boolean active;

}