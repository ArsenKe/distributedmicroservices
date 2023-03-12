package com.microservicesPetProject.customer;

public record CustomerRegistrationRequest(
        String name,
        String lastName,
        String email ) {
}
