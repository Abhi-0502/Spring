package com.xworkz.app.service;

import com.xworkz.app.dto.AmazonDto;

import java.util.List;

public interface AmazonService {

    boolean saveAndValidate(AmazonDto amazonDto);
    void UpdateProductId(int id ,AmazonDto amazonDto);
    boolean deleteProductId(int id);
    AmazonDto getUserById(int id);
    List<AmazonDto> getAllDetails(AmazonDto amazonDto);
    String getproductNameById(int id);
    String getProductQualityById(int id);
    String getProductPriceById(int id);
    Object[] getproductNameAndqualitybyId(int id);
    Object[] getpriceAndNameById(int id);
}
