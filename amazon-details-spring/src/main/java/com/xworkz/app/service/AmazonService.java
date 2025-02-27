package com.xworkz.app.service;

import com.xworkz.app.dto.AmazonDto;

import java.util.List;

public interface AmazonService {


    boolean save(AmazonDto amazonDto);
    List<AmazonDto> getAllDetails();boolean UpdateProductId(AmazonDto amazonDto);
    boolean deleteProductId(int id);
    AmazonDto getProductById(int id);
}
