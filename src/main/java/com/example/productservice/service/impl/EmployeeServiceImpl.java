package com.example.productservice.service.impl;

import com.example.productservice.constant.ExceptionMessage;
import com.example.productservice.entity.Employee;
import com.example.productservice.exception.InvalidException;
import com.example.productservice.payload.ActorRequest;
import com.example.productservice.repository.EmployeeRepository;
import com.example.productservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void create(ActorRequest actorRequest) throws InvalidException {
        if (actorRequest == null ||
            !StringUtils.hasText(actorRequest.getAccountId()) ||
            !StringUtils.hasText(actorRequest.getFullname()) ||
            !StringUtils.hasText(actorRequest.getEmail()) ||
            !StringUtils.hasText(actorRequest.getPhone())) {
            throw new InvalidException(ExceptionMessage.ERROR_CUSTOMER_INVALID_INPUT);
        }

        if (!actorRequest.getRole().equals("EMPLOYEE")) {
            throw new InvalidException(ExceptionMessage.ERROR_CUSTOMER_INVALID_INPUT);
        }

        Employee employee = Employee.builder()
                .accountId(actorRequest.getAccountId())
                .fullname(actorRequest.getFullname())
                .phone(actorRequest.getPhone())
                .email(actorRequest.getEmail())
                .build();

        employeeRepository.save(employee);
    }
}
