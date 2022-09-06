package service;

import dto.Purchase;
import dto.PurchaseResponse;



public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
