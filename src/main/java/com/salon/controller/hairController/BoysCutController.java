package com.salon.controller.hairController;

import com.salon.domain.hair.BoysCut;
import com.salon.factory.hairFactory.BoysCutFactory;
import com.salon.serviceImpl.hairServiceImpl.BoysCutServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/BoysCut")
public class BoysCutController {

    @Autowired
    private BoysCutServiceImpl boysCutService;

    @GetMapping("/create{types}")
    public @ResponseBody
    BoysCut create(@PathVariable String[] types, double price){
        BoysCut boysCut = BoysCutFactory.getBoysCut(types,price);
        return boysCutService.create(boysCut);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<BoysCut> getAll(){
        return boysCutService.getAll();
    }

}
