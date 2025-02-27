package com.xworkz.product.runner;

import com.xworkz.books.config.BSpringConfiguration;
import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductRunner {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BSpringConfiguration.class);
        ProductDto productDto = new ProductDto();
        ProductService productService = applicationContext.getBean(ProductService.class);

        productDto.setProductName("Eyeliner");
        productDto.setCategory("Designer");
        productDto.setProductPrice(899.9);
        productDto.setRatings(4.5);
        productService.validateAndSave(productDto);
        System.out.println("Added successfully...!!");
    }
}
