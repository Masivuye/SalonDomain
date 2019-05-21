package com.salon.controller.ordersController;

import com.salon.domain.orders.LocalSuppliers;
import com.salon.factory.ordersFactory.LocalSuppliersFactory;
import com.salon.service.Impl.ordersServiceImpl.LocalSupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/LocalSupplier")
public class LocalSupplierController {

    @Autowired
    private LocalSupplierServiceImpl localSupplierService;


    @GetMapping("/create{number}")
    public @ResponseBody
    LocalSuppliers create(@PathVariable String name, int number){
        LocalSuppliers localSuppliers = LocalSuppliersFactory.getLocal(name,number);
        return  localSupplierService.create(localSuppliers);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<LocalSuppliers> getAll(){
        return localSupplierService.getAll();
    }
}
