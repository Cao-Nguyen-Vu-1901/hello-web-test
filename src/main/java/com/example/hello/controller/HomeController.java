package com.example.hello.controller;

import com.example.hello.service.ProductService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class HomeController {

    ProductService productService;
    @GetMapping("/home")
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("products", productService.getAll());
        return "index";
    }

}
