package com.xworkz.medisales.repository;

import com.xworkz.medisales.entity.MediSalesEntity;

public interface MediSalesDao {

    boolean Save(MediSalesEntity mediSalesEntity);
    boolean findByEmail(String email);
    MediSalesEntity findByEmailAnd(String email);
    MediSalesEntity checkEmail(String email);
}
