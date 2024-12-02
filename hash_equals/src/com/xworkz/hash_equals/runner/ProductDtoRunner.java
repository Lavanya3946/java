package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.ProductDto;

public class ProductDtoRunner {
    public static void main(String[] args) {
        ProductDto productDto1=new ProductDto("pods",345,"earphones","good");
        ProductDto productDto2=new ProductDto("pods",345,"earphones","good");
        System.out.println("productDto1 is equals to product 2:"+productDto1.equals(productDto2));
        System.out.println("product 1 hash code:"+productDto1.hashCode());
        System.out.println("product 2 hash code:"+productDto2.hashCode());


    }
}
