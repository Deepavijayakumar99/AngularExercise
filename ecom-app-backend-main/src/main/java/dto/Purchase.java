package dto;

import lombok.Data;

import java.util.List;

import entity.Address;
import entity.Customer;
import entity.Order;
import entity.OrderItem;


@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private List<OrderItem> orderItems;
}

