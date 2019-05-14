package com.salon.controller.paymentController;

import com.salon.domain.payment.Cheque;
import com.salon.factory.paymentFactory.ChequeFactory;
import com.salon.service.impl.paymentServiceImpl.ChequeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/Cheque")
public class ChequeController {

    @Autowired
    private ChequeServiceImpl chequeService;

    @GetMapping("/create{balance}")
    public @ResponseBody
    Cheque create(@PathVariable double balance){
        Cheque cheque = ChequeFactory.getCheque(balance);
        return chequeService.create(cheque);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Cheque> getAll(){
        return chequeService.getAll();
    }
}
