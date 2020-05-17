package com.coco.redisdemo.controller;

import com.coco.redisdemo.model.PiCalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PiCalculatorController {
    @Autowired
    private PiCalculator cal;
    @GetMapping
    public String istest(){
        return "okkkk";
    }
    @GetMapping(value="pi")
    public long pi() {
        long setTime = System.currentTimeMillis();
        cal.calculatePi(10_000_000);
        long endTime = System.currentTimeMillis();
        return Long.valueOf(endTime-setTime);
    }
    
}