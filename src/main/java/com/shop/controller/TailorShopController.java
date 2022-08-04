package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TailorShopController {

    @GetMapping("/tailorshop")
    public String showTailorShop() {
        return "/tailorshop/tailor";
    }
}