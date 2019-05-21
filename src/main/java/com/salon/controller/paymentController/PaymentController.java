package com.salon.controller.paymentController;

import com.salon.domain.payment.Payment;
import com.salon.factory.paymentFactory.PaymentFactory;
import com.salon.service.Impl.paymentServiceImpl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/Payment")
public class PaymentController {

    @Autowired
    private PaymentServiceImpl paymentService;


    @GetMapping("/create{question}")
    public @ResponseBody
    Payment create(@PathVariable boolean question){
        Payment payment = PaymentFactory.getPayment(question);
        return paymentService.create(payment);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Payment> getAll(){
        return paymentService.getAll();
    }
}
