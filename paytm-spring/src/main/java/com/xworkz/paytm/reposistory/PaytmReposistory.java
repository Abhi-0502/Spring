package com.xworkz.paytm.reposistory;

import com.xworkz.paytm.dto.PaytmDto;

import java.util.List;

public interface PaytmReposistory {

    boolean Validateandsave(PaytmDto paytmDto);
    List<PaytmDto> getAllUser();
    boolean getdeleteById(int id);
    PaytmDto getPaytmById(int id);
    boolean UpdatePaytmUser(PaytmDto paytmDto);
}
