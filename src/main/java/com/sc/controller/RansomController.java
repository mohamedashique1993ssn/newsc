package com.sc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sc.domain.Ransom;
import com.sc.service.RansomService;

@RestController
@RequestMapping("/ransom")
public class RansomController {

    private RansomService ransomService;


    public RansomController(RansomService ransomService) {
        this.ransomService = ransomService;
    }
    
    @GetMapping("/list")
    public Iterable<Ransom> listRansom() {
        return ransomService.list();
    }

}
