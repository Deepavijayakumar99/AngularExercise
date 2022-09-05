package service;

import dto.Purchase;
import dto.PurchaseResponse;

/**
 * @author <a href="https://github.com/ouhamzalhss"> Lhouceine OUHAMZA </a>
 */

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
