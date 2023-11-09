package com.salakommerceb.web;

import com.salakommerceb.common.dto.CustomerDTO;
import com.salakommerceb.common.exception.CheckException;
import com.salakommerceb.common.exception.CreateException;
import com.salakommerceb.server.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Customer controller.
 */
@RestController
@RequestMapping("/category")

public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    /**
     * Create customer customer dto.
     *
     * @param customerDTO the customer dto
     * @return the customer dto
     * @throws CheckException  the check exception
     * @throws CreateException the create exception
     */
    @PostMapping("/createCustomer")
    CustomerDTO createCustomer(@RequestBody CustomerDTO customerDTO) throws CheckException, CreateException {
        return iCustomerService.createCustomer(customerDTO);
    }
}
