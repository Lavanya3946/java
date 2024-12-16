package com.xworkz.ecom.Dto;

import lombok.*;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductDto {

    private  int productId;
    private  String productName;
    private  double price;
    private  int quantity;
    private LocalDate mnf;
    private  float ratings;
}
