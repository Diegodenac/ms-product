package com.example.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdateProductDto {
    private final Integer id;
    private final ProductDto productDto;
}
