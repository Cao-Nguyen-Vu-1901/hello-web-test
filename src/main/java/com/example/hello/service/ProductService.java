package com.example.hello.service;

import com.example.hello.dto.response.ProductResponse;
import com.example.hello.mapper.ProductMapper;
import com.example.hello.repo.ProductRepo;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductService {

    ProductRepo productRepo;
    ProductMapper productMapper;

    public List<ProductResponse> getAll(){
        return productRepo.findAll().stream().map(productMapper::toProductResponse).collect(Collectors.toList());
    }

}
