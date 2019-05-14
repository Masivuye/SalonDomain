package com.salon.controller.manicureController;

import com.salon.domain.manicure.Nails;
import com.salon.factory.manicureFactory.NailsFactory;
import com.salon.service.impl.manicureServiceImpl.NailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/Nails")
public class NailsController {

    @Autowired
    private NailsServiceImpl nailsService;

    @GetMapping("/create{shapes}")
    public @ResponseBody
    Nails create(@PathVariable String[] colors, String[] shapes){
        Nails nails = NailsFactory.getNails(colors,shapes);
        return nailsService.create(nails);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Nails> getAll(){
        return nailsService.getAll();
    }
}
