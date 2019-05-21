package com.salon.controller.manicureController;

import com.salon.domain.manicure.Manicure;
import com.salon.factory.manicureFactory.ManicureFactory;
import com.salon.serviceImpl.manicureServiceImpl.ManicureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/Manicure")
public class ManicureController {

    @Autowired
    private ManicureServiceImpl manicureService;


    @GetMapping("/create{types}")
    public @ResponseBody
    Manicure create(@PathVariable String[] colors,String[] types){
        Manicure manicure = ManicureFactory.getManicure(colors,types);
        return manicureService.create(manicure);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Manicure> getAll(){
        return manicureService.getAll();
    }

}
