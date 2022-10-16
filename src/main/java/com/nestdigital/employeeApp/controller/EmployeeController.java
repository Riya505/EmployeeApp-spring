package com.nestdigital.employeeApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public  String Homepage(){
        return "welcome to employee home page";
    }
    @GetMapping("/add")
    public  String EmployeeAdd(){
        return "welcome to employee add page";
    }
    @GetMapping("/search")
    public  String EmployeeSearch(){
        return "welcome to employee search page";
    }
    @GetMapping("/delete")
    public  String EmployeeDelete(){
        return "welcome to employee delete page";
    }

}
