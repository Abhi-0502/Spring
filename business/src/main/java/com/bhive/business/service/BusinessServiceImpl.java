package com.bhive.business.service;

import com.bhive.business.dto.BusinessDto;
import com.bhive.business.repository.BusinessDaoImpl;

import java.util.List;

public class BusinessServiceImpl {

    private final BusinessDaoImpl clientDAO;

    public BusinessServiceImpl(BusinessDaoImpl clientDAO) {
        this.clientDAO = clientDAO;
    }

    public void registerClient(String name, String industry) {
        BusinessDto client = new BusinessDto();
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
