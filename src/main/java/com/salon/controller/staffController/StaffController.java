package com.salon.controller.staffController;

import com.salon.domain.staff.Staff;
import com.salon.factory.staffFactory.StaffFactory;
import com.salon.service.Impl.staffServiceImpl.StaffServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/Staff")
public class StaffController {

    @Autowired
    private StaffServiceImpl staffService;

    @GetMapping("/create{names}")
    public @ResponseBody
    Staff create(@PathVariable String[] names, int staffNum){
        Staff staff = StaffFactory.getStaff(names,staffNum);
        return staffService.create(staff);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Staff> getAll(){
        return staffService.getAll();
    }
}
