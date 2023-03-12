package com.microservicesPetProject.customer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
    private Integer id;
    private String name;
    private String lastname;
    private String email;
}
