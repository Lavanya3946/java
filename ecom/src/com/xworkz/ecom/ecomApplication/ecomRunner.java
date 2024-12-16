package com.xworkz.ecom.ecomApplication;

import com.xworkz.ecom.Dto.ProductDto;
import java.time.LocalDate;

public class ecomRunner {
    public static void main(String[] args) {
        ProductDto productDto1=new ProductDto();
        productDto1.setProductId(1);
        productDto1.setProductName("MTR");
        productDto1.setPrice(30.24);
        productDto1.setQuantity(2);
        productDto1.setMnf(LocalDate.of(2024 ,12, 13));
        productDto1.setRatings(4.0f);

        ProductDto productDto2=new ProductDto();
        productDto2.setProductId(2);
        productDto2.setProductName("Mi Tv");
        productDto2.setPrice(3000.00);
        productDto2.setQuantity(1);
        productDto2.setMnf(LocalDate.of(2024 ,11, 13));
        productDto2.setRatings(4.0f);

        ProductDto productDto3=new ProductDto();
        productDto3.setProductId(3);
        productDto3.setProductName("vivo mobile");
        productDto3.setPrice(35000.00);
        productDto3.setQuantity(1);
        productDto3.setMnf(LocalDate.of(2022 ,1, 1));
        productDto3.setRatings(4.0f);

        EcomApplication ecomApplication=new EcomApplication();
        ecomApplication.saveDto(productDto1);
        boolean result = true;
        if(result){
            System.out.println("data saved");
        }
        else {
            System.out.println(" data not saved");
        }

        ecomApplication.saveDto(productDto2);
        if(result){
            System.out.println("data saved");
        }
        else {
            System.out.println(" data not saved");
        }

        ecomApplication.saveDto(productDto3);
        if(result){
            System.out.println("data saved");
        }
        else {
            System.out.println(" data not saved");
        }

        ecomApplication.read();
        ecomApplication.update(2,"GRB");
        boolean res=true;
        if(res){
            System.out.println("updated");
        }
        else{
            System.out.println("not updated");
        }
//        ecomApplication.update(4,"GRB");
//        boolean res1=false;
//        if(res1){
//            System.out.println("updated");
//        }
//        else{
//            System.out.println("not updated");
//        }

        ecomApplication.read();
        ecomApplication.delete(2);
        ecomApplication.delete(5);
        ecomApplication.read();

    }
}
