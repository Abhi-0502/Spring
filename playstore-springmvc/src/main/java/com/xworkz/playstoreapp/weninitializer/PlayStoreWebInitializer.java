package com.xworkz.playstoreapp.weninitializer;

import com.xworkz.playstoreapp.configuration.SpringConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class PlayStoreWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

   public  PlayStoreWebInitializer(){
        System.out.println("SpringWebInitializer is invoked");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("getRootConfigClasses is invoked");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("getServletConfigClasses is invoked");
        return new Class[]{SpringConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("getServletMappings");
        return new String[]{"/"};
    }
}
