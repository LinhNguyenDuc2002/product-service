package com.example.productservice.service;

import com.example.productservice.dto.CommentDTO;
import com.example.productservice.exception.InvalidException;
import com.example.productservice.exception.NotFoundException;
import com.example.productservice.payload.CommentRequest;

public interface CommentService {
    CommentDTO create(String id, CommentRequest commentRequest) throws NotFoundException, InvalidException;

    CommentDTO update(String id, CommentRequest commentRequest) throws NotFoundException, InvalidException;

    void delete(String id) throws NotFoundException, InvalidException;
}
