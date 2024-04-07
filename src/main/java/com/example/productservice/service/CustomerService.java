package com.example.productservice.service;

import com.example.productservice.dto.CustomerDTO;
import com.example.productservice.dto.ShopDTO;
import com.example.productservice.exception.InvalidException;
import com.example.productservice.exception.NotFoundException;
import com.example.productservice.payload.ActorRequest;
import com.example.productservice.payload.ShopRequest;
import com.example.productservice.payload.response.PageResponse;

public interface CustomerService {
    void create(ActorRequest actorRequest) throws InvalidException;

    ShopDTO createShop(String id, ShopRequest shopRequest) throws InvalidException, NotFoundException;

    PageResponse<CustomerDTO> getAll(Integer page, Integer size);

    CustomerDTO get(String id) throws NotFoundException;

    void delete(String id) throws NotFoundException;
}
