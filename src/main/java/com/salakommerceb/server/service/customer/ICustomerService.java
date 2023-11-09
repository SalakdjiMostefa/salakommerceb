package com.salakommerceb.server.service.customer;

import com.salakommerceb.common.dto.CustomerDTO;
import com.salakommerceb.common.dto.UserConnectDTO;
import com.salakommerceb.common.dto.UserDTO;
import com.salakommerceb.common.exception.*;

import java.util.Collection;


/**
 * The interface Customer service.
 */
public interface ICustomerService {

    // ======================================
    // =           Business methods         =
    // ======================================

    /**
     * Authenticate customer dto.
     *
     * @param customerId the customer id
     * @param password   the password
     * @return the customer dto
     * @throws FinderException the finder exception
     * @throws CheckException  the check exception
     */
    CustomerDTO authenticate(Long customerId, String password) throws FinderException, CheckException;

    /**
     * Create customer customer dto.
     *
     * @param customerDTO the customer dto
     * @return the customer dto
     * @throws CreateException the create exception
     * @throws CheckException  the check exception
     */
    CustomerDTO createCustomer(CustomerDTO customerDTO) throws CreateException, CheckException;

    /**
     * Find customer customer dto.
     *
     * @param customerId the customer id
     * @return the customer dto
     * @throws FinderException the finder exception
     * @throws CheckException  the check exception
     */
    CustomerDTO findCustomer(Long customerId) throws FinderException, CheckException;

    /**
     * Delete customer.
     *
     * @param customerId the customer id
     * @throws RemoveException the remove exception
     * @throws CheckException  the check exception
     */
    void deleteCustomer(Long customerId) throws RemoveException, CheckException;

    /**
     * Update customer.
     *
     * @param customerDTO the customer dto
     * @throws UpdateException the update exception
     * @throws CheckException  the check exception
     */
    void updateCustomer(CustomerDTO customerDTO) throws UpdateException, CheckException;

    /**
     * Find customers collection.
     *
     * @return the collection
     * @throws FinderException the finder exception
     */
    Collection<CustomerDTO> findCustomers() throws FinderException;

    /**
     * Sets user.
     *
     * @param userDTO the user dto
     * @throws CheckException  the check exception
     * @throws CreateException the create exception
     */
    void setUser(UserDTO userDTO) throws CheckException, CreateException;

    /**
     * Connect user boolean.
     *
     * @param userDTO the user dto
     * @return the boolean
     */
    boolean connectUser(UserConnectDTO userDTO);
}
