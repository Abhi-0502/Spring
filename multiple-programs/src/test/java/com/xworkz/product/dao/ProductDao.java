package com.xworkz.product.dao;

import com.xworkz.product.dto.ProductDto;

import java.util.List;

public interface ProductDao {

    boolean save(ProductDto productDto);

    void UpdateProductId(int id ,ProductDto productDto);

    ProductDto getUserById(int id);

    List<ProductDto> getAllDetails(ProductDto productDto);

    boolean deleteProductId(int id);

}
