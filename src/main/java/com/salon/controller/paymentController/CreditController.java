package com.salon.controller.paymentController;

import com.salon.domain.payment.Credit;
import com.salon.factory.paymentFactory.CreditFactory;
import com.salon.service.Impl.paymentServiceImpl.CreditServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/Credit")
public class CreditController {

    @Autowired
    private CreditServiceImpl creditService;

    @GetMapping("/create{balance}")
    public @ResponseBody
    Credit create(@PathVariable double balance){
        Credit credit = CreditFactory.getCredit(balance);
        return  creditService.create(credit);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Credit> getAll(){
        return creditService.getAll();
    }
}
