package com.salon.controller.paymentController;

import com.salon.domain.payment.CardPayment;
import com.salon.factory.paymentFactory.CardPaymentFactory;
import com.salon.service.impl.paymentServiceImpl.CardPaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/CardPayment")
public class CardPaymentController {

    @Autowired
    private CardPaymentServiceImpl cardPaymentService;

    @GetMapping("/create{balance}")
    public @ResponseBody
    CardPayment create(@PathVariable double balance){
        CardPayment cardPayment = CardPaymentFactory.getCard(balance);
        return cardPaymentService.create(cardPayment);
    }
    @GetMapping("/getAll")
    @ResponseBody
    public Set<CardPayment> getAll(){
      return   cardPaymentService.getAll();
    }
}
