package com.salon.controller.manicureController;

import com.salon.domain.manicure.UpperMassage;
import com.salon.factory.manicureFactory.UpperMassageFactory;
import com.salon.service.Impl.manicureServiceImpl.UpperMassageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/UpperMassage")
public class UpperMassageController {

    @Autowired
    private UpperMassageServiceImpl upperMassageService;

    @GetMapping("/create{price}")
    public @ResponseBody
    UpperMassage create(@PathVariable double price){
        UpperMassage upperMassage = UpperMassageFactory.getUpperMassage(price);
        return upperMassageService.create(upperMassage);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<UpperMassage> getAll(){
        return upperMassageService.getAll();
    }
}
