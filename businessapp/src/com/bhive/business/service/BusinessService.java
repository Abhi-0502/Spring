package com.bhive.business.service;

import com.bhive.business.dao.BusinessDao;
import com.bhive.business.dto.BusinessDto;

import java.util.List;

public class BusinessService {


    private final BusinessDao clientDAO;

    public BusinessService(BusinessDao clientDAO) {
        this.clientDAO = clientDAO;
    }

    public void registerClient(String name, String industry) {
        BusinessDto client = new BusinessDto(name,industry);
        clientDAO.save(client);
    }

    public void showClients() {
        List<BusinessDto> clients = clientDAO.getAllClients();
        if (clients.isEmpty()) {
            System.out.println("No clients registered.");
        } else {
            clients.forEach(System.out::println);
        }
    }
}
