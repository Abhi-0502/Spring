package com.xworkz.app.reposistory;

import com.xworkz.app.dto.AmazonDto;

import java.util.List;

public interface AmazonReposistory {

    boolean save(AmazonDto amazonDto);
    List<AmazonDto> getAllDetails();boolean UpdateProductId(AmazonDto amazonDto);
    boolean deleteProductId(int id);
    AmazonDto getProductById(int id);

}
