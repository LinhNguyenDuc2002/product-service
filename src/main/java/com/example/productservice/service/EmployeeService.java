package com.example.productservice.service;

import com.example.productservice.exception.InvalidException;
import com.example.productservice.payload.ActorRequest;

public interface EmployeeService {
    void create(ActorRequest actorRequest) throws InvalidException;
}
