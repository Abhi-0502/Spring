package com.xworkz.app.webinitializer;

import com.xworkz.app.configuration.SpringConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MoviesWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    public MoviesWebInitializer(){
        System.out.println("MoviesWebInitializer invoked");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
