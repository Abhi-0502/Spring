package com.xworkz.app.service;

import com.xworkz.app.dto.AmazonDto;
import com.xworkz.app.reposistory.AmazonReposistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AmazonServiceImpl implements AmazonService{

   @Autowired
    AmazonReposistory amazonReposistory;
    @Override
    public boolean save(AmazonDto amazonDto) {
        return amazonReposistory.save(amazonDto);
    }

    @Override
    public List<AmazonDto> getAllDetails() {
        return amazonReposistory.getAllDetails();
    }

    @Override
    public boolean UpdateProductId(AmazonDto amazonDto) {
        return amazonReposistory.UpdateProductId(amazonDto);
    }

    @Override
    public boolean deleteProductId(int id) {
        return amazonReposistory.deleteProductId(id);
    }

    @Override
    public AmazonDto getProductById(int id) {
        return amazonReposistory.getProductById(id);
    }
}
