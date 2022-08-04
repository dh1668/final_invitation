package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HanbokController {

    @GetMapping("/hanbok")
    public String showHanbok() {
        return "/hanbok/index";
    }

    @GetMapping("/story")
    public String showHanbokAbout() {
        return "/hanbok/about";
    }

    @GetMapping("/services")
    public String showHanbokServices() {
        return "/hanbok/services";
    }

    @GetMapping("/gallery")
    public String showHanbokGallery() {
        return "/hanbok/gallery";
    }

    @GetMapping("/contact")
    public String showHanbokContact() {
        return "/hanbok/contact";
    }
}
