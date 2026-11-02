package br.com.yoyo.spring_boot_essencials.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/oi-yoyo")
public class OiYoyoController {

    @GetMapping
    public String oiYoyo() {
        return "oi, yoyo!";
    }
}


