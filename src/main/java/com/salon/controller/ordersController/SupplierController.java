package com.salon.controller.ordersController;

import com.salon.domain.orders.Supplier;
import com.salon.factory.ordersFactory.SupplierFactory;
import com.salon.service.impl.ordersServiceImpl.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/Supplier")
public class SupplierController {

    @Autowired
    private SupplierServiceImpl supplierService;


    @GetMapping("/create{supNumber}")
    public @ResponseBody
    Supplier create(@PathVariable String name, int supNumber){
        Supplier supplier = SupplierFactory.getSupplier(name,supNumber);
        return supplierService.create(supplier);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Supplier> getAll(){
        return supplierService.getAll();
    }

}
