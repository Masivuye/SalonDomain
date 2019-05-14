package com.salon.controller.ordersController;

import com.salon.domain.orders.ImportSupplier;
import com.salon.factory.ordersFactory.ImportSupplierFactory;
import com.salon.service.impl.ordersServiceImpl.ImportSupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/ImportSupplier")
public class ImportSupplierController {

    @Autowired
    private ImportSupplierServiceImpl importSupplierService;

    @GetMapping("/create{number}")
    public @ResponseBody
    ImportSupplier create(@PathVariable String name,int number){
        ImportSupplier importSupplier = ImportSupplierFactory.getImports(name,number);
        return importSupplierService.create(importSupplier);
    }


    @GetMapping("/getAll")
    @ResponseBody
    public Set<ImportSupplier> getAll(){
        return importSupplierService.getAll();
    }
}
