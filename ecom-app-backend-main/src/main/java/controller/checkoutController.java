package controller;

import service.CheckoutService;

import org.springframework.web.bind.annotation.*;

import dto.Purchase;
import dto.PurchaseResponse;

/**
 * @author <a href="https://github.com/ouhamzalhss"> Lhouceine OUHAMZA </a>
 */

@RestController
@CrossOrigin()
@RequestMapping("/api/checkout")
public class checkoutController {

    private CheckoutService checkoutService;


    public checkoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse purchase(@RequestBody Purchase purchase){
        PurchaseResponse response = this.checkoutService.placeOrder(purchase);
        return response;
    }
}
