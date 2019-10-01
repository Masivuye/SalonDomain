package com.salon.controller.staffController;

import com.salon.domain.staff.Admin;
import com.salon.factory.staffFactory.AdminFactory;
import com.salon.service.Impl.staffServiceImpl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/Admin")
public class AdminController {

    @Autowired
    private AdminServiceImpl adminService;

    @GetMapping("/create{name}")
    public @ResponseBody
    Admin create(@PathVariable String name,int adnum){
        Admin admin = AdminFactory.getAmin(name,adnum);
        return adminService.create(admin);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Admin> getAll(){
        return adminService.getAll();
    }
}
