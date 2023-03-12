package com.microservicesPetProject.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .name(request.name())
        .lastname(request.lastName())
        .email(request.email())
        .build();

    }


}
