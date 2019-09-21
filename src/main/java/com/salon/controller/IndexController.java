package com.salon.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping(value ={"/","/salon"})
    public ResponseEntity<String> home(){
        return  new ResponseEntity<>("Welcome to Masivuye's Salon", HttpStatus.OK);
    }
    /*@ResponseBody
    public String getHome() {
        return " Hello World ";
    }*/

}
