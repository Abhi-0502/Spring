package com.xworkz.userapp.webInitializer;

import com.xworkz.userapp.config.SpringConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {

    public SpringWebInitializer(){
        System.out.println("SpringWebInitializer constructor invoked");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("started with getRootConfigClasses()");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("started with getServletConfigClasses()");
        return new Class[]{SpringConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("started with getServletMappings()");
        return new String[]{"/"};
    }
}
