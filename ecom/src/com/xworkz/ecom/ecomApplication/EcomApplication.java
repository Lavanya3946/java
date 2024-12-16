package com.xworkz.ecom.ecomApplication;

import com.xworkz.ecom.Dto.ProductDto;

import java.util.Arrays;


public class EcomApplication {

    ProductDto productDto[] = new ProductDto[3];
    int index = 0;

    public boolean saveDto(ProductDto dto) {
        if (dto != null) {
            productDto[index] = dto;
            index++;
            return true;
        } else {
            return false;
        }
    }

    public void read() {
        for (ProductDto dto : productDto) {
            System.out.println(dto);
        }
    }

    public boolean update(int id, String newproductName) {
        boolean update = true;

        for (ProductDto dto : productDto) {
            if (dto.getProductId() == id) {
                dto.setProductName(newproductName);
                update = true;
            } else {
                update = false;

            }
        }
            return update;
        }
        
        public  boolean delete(int id){
        boolean isDelete=false;
        int i,j;
            for ( i = 0,j=0; i <productDto.length ; i++) {
                if(productDto[i].getProductId()!=id){
                    this.productDto[j++]=productDto[i];
                    isDelete=true;

            }
                
            }
            productDto= Arrays.copyOf(productDto,j);
            readAfterDelete(productDto);
            return  isDelete;
        }
        public  void readAfterDelete(ProductDto[]  deleteDto){
            System.out.println("After delete");
            for (ProductDto dtoDelete:productDto){
                System.out.println(dtoDelete);
            }
        }


}
