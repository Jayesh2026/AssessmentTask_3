package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.CalculationService;

@RestController
@RequestMapping("/calculation")
public class CalculationController {

    @Autowired
    private CalculationService calculationService;

    @GetMapping("/run")
    public void getRunAll() {
        calculationService.executeTasks();
    }
    
}
