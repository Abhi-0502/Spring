package com.bhive.business.runner;

import com.bhive.business.repository.BusinessDaoImpl;
import com.bhive.business.service.BusinessServiceImpl;

public class BusinessRunner {

    public static void main(String[] args) {
        BusinessDaoImpl clientDAO = new BusinessDaoImpl();
        BusinessServiceImpl clientService = new BusinessServiceImpl(clientDAO);

        clientService.registerClient("ABC Corp", "IT");
        clientService.registerClient("XYZ Ltd", "Finance");

        System.out.println("\n--- List of Clients ---");
        clientService.showClients();
    }
}
