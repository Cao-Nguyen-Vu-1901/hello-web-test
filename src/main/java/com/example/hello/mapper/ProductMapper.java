package com.example.hello.mapper;

import com.example.hello.dto.response.ProductResponse;
import com.example.hello.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductResponse toProductResponse(Product product);
}
