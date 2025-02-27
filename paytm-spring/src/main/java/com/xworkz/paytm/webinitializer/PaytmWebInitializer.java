package com.xworkz.paytm.webinitializer;

import com.xworkz.paytm.configuration.SpringConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class PaytmWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    public PaytmWebInitializer(){
        System.out.println("PaytmWebInitializer is invoked");

    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("getRootConfigClasses started");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("getServletConfigClasses started");
        return new Class[]{SpringConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("getServletMappings started");
        return new String[]{"/"};
    }
}
