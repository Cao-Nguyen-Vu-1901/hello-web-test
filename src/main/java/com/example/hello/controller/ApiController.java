package com.example.hello.controller;

import com.example.hello.dto.response.ApiResponse;
import com.example.hello.dto.response.ProductResponse;
import com.example.hello.service.ProductService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ApiController {

    ProductService productService;
    @GetMapping("/api/products")
    public ApiResponse<List<ProductResponse>> hello(){

        return  ApiResponse.<List<ProductResponse>>builder().result(productService.getAll()).build();
    }

}
