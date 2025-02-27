package com.bhive.business.runner;

import com.bhive.business.dao.BusinessDao;
import com.bhive.business.service.BusinessService;

public class BusinessRunner {

    public static void main(String[] args) {
        BusinessDao clientDAO = new BusinessDao();
        BusinessService clientService = new BusinessService(clientDAO);

        clientService.registerClient("ABC Corp", "IT");
        clientService.registerClient("XYZ Ltd", "Finance");

        System.out.println("\n--- List of Clients ---");
        clientService.showClients();
    }
}
