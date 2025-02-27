package com.xworkz.medisales.services;

import com.xworkz.medisales.dto.MediSalesDto;

public interface MediSalesServices {

    boolean validateAndSignIn(MediSalesDto mediSalesDto);
    //MediSalesDto signIn(String email, String password);

}
