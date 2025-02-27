package com.xworkz.app.dao;

import com.xworkz.app.dto.ProductDto;

import java.util.List;

public interface ProductDao {

    boolean save(ProductDto productDto);
    void UpdateProductId(int id ,ProductDto productDto);
    boolean deleteProductId(int id);
    ProductDto getUserById(int id);
    List<ProductDto> getAllDetails(ProductDto productDto);
    String getUserNameById(int id);
    Object[] getUserNameAndcategoryById(int id);
    Object[] getcategoryAndproductNoById(int id);
    String getproductNoById(int id);
    String getCategoryById(int id);
}
