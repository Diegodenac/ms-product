package com.example.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDto {
    private int id;
    private String name;
    private String description;

    public ProductDto(){}

    public ProductDto(Product product){
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
    }

    public  Product toProduct() {
        var product = new Product();
        product.setName(this.name);
        product.setDescription(this.description);
        return product;
    }
}
