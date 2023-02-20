package com.kakaobank.codingtest.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Log4j2
@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        System.out.println("test");
        return "/index";
    }

}
