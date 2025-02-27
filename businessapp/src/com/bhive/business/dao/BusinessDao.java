package com.bhive.business.dao;

import com.bhive.business.dto.BusinessDto;

import java.util.ArrayList;
import java.util.List;

public class BusinessDao {

    private List<BusinessDto> clients = new ArrayList<>();

    public void save(BusinessDto client) {
        clients.add(client);
        System.out.println("Client saved: " + client);
    }

    public List<BusinessDto> getAllClients() {
        return clients;
    }
}
