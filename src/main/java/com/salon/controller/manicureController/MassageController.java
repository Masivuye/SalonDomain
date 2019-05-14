package com.salon.controller.manicureController;

import com.salon.domain.manicure.Massage;
import com.salon.factory.manicureFactory.MassageFactory;
import com.salon.service.impl.manicureServiceImpl.MassageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/salon/Massage")
public class MassageController {

    @Autowired
    private MassageServiceImpl massageService;

    @GetMapping("/create{types}")
    public @ResponseBody
    Massage create(@PathVariable String[] types){
        Massage massage = MassageFactory.getMassage(types);
        return  massageService.create(massage);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Massage> getAll(){
        return massageService.getAll();
    }
}
