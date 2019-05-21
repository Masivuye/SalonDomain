package com.salon.controller.paymentController;

import com.salon.domain.payment.Debit;
import com.salon.factory.paymentFactory.DebitFactory;
import com.salon.service.Impl.paymentServiceImpl.DebitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/Debit")
public class DebitController {

    @Autowired
    private DebitServiceImpl debitService;

    @GetMapping("/create{balance}")
    public @ResponseBody
    Debit create(@PathVariable double balance){
        Debit debit = DebitFactory.getDebit(balance);
        return debitService.create(debit);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Debit> getAll(){
        return debitService.getAll();
    }
}
