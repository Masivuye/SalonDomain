package com.salon.controller.paymentController;

import com.salon.domain.payment.CashPayment;
import com.salon.factory.paymentFactory.CashPaymentFactory;
import com.salon.service.impl.paymentServiceImpl.CashPaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/CashPayment")
public class CashPaymentController {

    @Autowired
    private CashPaymentServiceImpl cashPaymentService;

    @GetMapping("/create{amount}")
    public @ResponseBody
    CashPayment create(@PathVariable double amount){
        CashPayment cashPayment = CashPaymentFactory.getCash(amount);
        return cashPaymentService.create(cashPayment);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<CashPayment> getAll(){
        return cashPaymentService.getAll();
    }
}
