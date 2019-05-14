package com.salon.controller.hairController;

import com.salon.domain.hair.Promotions;
import com.salon.factory.hairFactory.PromotionsFactory;
import com.salon.service.impl.hairServiceImpl.PromotionsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/salon/Promotions")
public class PromotionsController {

    @Autowired
    private PromotionsServiceImpl promotionsService;

    @GetMapping("/create{products")
     public @ResponseBody
    Promotions create(@PathVariable String[] products){
        Promotions promotions = PromotionsFactory.getPromotions(products);
        return promotionsService.create(promotions);
    }
}
