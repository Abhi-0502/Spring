package com.xworkz.app.webinitializer;

import com.xworkz.app.configuration.SpringConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AmazonWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    public AmazonWebInitializer(){
        System.out.println("AmazonWebInitializer is invoked");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
