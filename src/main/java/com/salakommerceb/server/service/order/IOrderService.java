package com.salakommerceb.server.service.order;

import com.salakommerceb.common.dto.CartDTO;
import com.salakommerceb.common.dto.OrderDTO;
import com.salakommerceb.common.exception.CheckException;
import com.salakommerceb.common.exception.CreateException;
import com.salakommerceb.common.exception.FinderException;
import com.salakommerceb.common.exception.RemoveException;

import java.util.List;
import java.util.Map;

/**
 * This interface gives a remote view of the OrderServiceBean. Any distant client that wants to call
 * a method on the OrderServiceBean has to use this interface.
 */
public interface IOrderService {

    // ======================================
    // =           Business methods         =
    // ======================================

    /**
     * Create order long.
     *
     * @param customerId   the customer id
     * @param shoppingCart the shopping cart
     * @return the long
     * @throws CreateException the create exception
     * @throws CheckException  the check exception
     */
    Long createOrder(final Long customerId, Map shoppingCart) throws CreateException, CheckException;


    /**
     * Create order order dto.
     *
     * @param orderDTO the order dto
     * @return the order dto
     * @throws CreateException the create exception
     * @throws CheckException  the check exception
     */
    OrderDTO createOrder(CartDTO orderDTO) throws CreateException, CheckException;

    /**
     * Find order order dto.
     *
     * @param orderId the order id
     * @return the order dto
     * @throws FinderException the finder exception
     * @throws CheckException  the check exception
     */
    OrderDTO findOrder(Long orderId) throws FinderException, CheckException;


    /**
     * Delete order.
     *
     * @param orderId the order id
     * @throws RemoveException the remove exception
     * @throws CheckException  the check exception
     */
    void deleteOrder(Long orderId) throws RemoveException, CheckException;

    /**
     * Gets all orders by email.
     *
     * @param email the email
     * @return the all orders by email
     */
    List<OrderDTO> getAllOrdersByEmail(String email);
}
