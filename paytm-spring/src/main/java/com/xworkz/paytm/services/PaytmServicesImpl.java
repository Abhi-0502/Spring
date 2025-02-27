package com.xworkz.paytm.services;

import com.xworkz.paytm.dto.PaytmDto;
import com.xworkz.paytm.reposistory.PaytmReposistory;
import com.xworkz.paytm.reposistory.PaytmReposistoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PaytmServicesImpl implements PaytmServices{

    @Autowired
    PaytmReposistoryImpl paytmReposistory;

    public PaytmServicesImpl(){
        System.out.println("PaytmServicesImpl invoked");
    }
    @Override
    public boolean Validateandsave(PaytmDto paytmDto) {
        if (paytmDto != null){
            paytmReposistory.Validateandsave(paytmDto);
            System.out.println("Paytm details are Validated");
        }
        return true;
    }

    @Override
    public List<PaytmDto> getAllUser() {
        return paytmReposistory.getAllUser();
    }

    @Override
    public boolean getdeleteById(int id) {
        return paytmReposistory.getdeleteById(id);
    }

    @Override
    public PaytmDto getPaytmById(int id) {
        return paytmReposistory.getPaytmById(id);
    }

    @Override
    public boolean UpdatePaytmUser(PaytmDto paytmDto) {
        return paytmReposistory.UpdatePaytmUser(paytmDto);
    }
}
