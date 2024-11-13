package com.xworkz.playStore.Car;

public class CarSaveDetails {
    CarDto carDto[]=new CarDto[5];
    int index=0;

    public String carDetailsSave(CarDto dto){
        if(dto!=null){
            carDto[index]=dto;
            index++;
            return "Car data is saved..";
        }
        else {
            return  "Car data is not found..";
        }
    }
    public  void read(){
        for (int index = 0; index <carDto.length ; index++) {
            System.out.println(carDto[index]);
        }
    }

    public  void findCarByModel(String model){
        for (int i = 0; i <carDto.length ; i++) {
            if (carDto[i].getModel()==model)
            System.out.println("Finding car by Model:"+carDto[i]);
        }
    }
      public  void findCarByPrice(int price){
          for (int i = 0; i < carDto.length; i++) {
              if (carDto[i].getPrice()==price)
                  System.out.println("Finding car by Price:"+carDto[i]);
          }
      }
      public  void findCarByYear(int year){
          for (int i = 0; i < carDto.length; i++) {
              if (carDto[i].getYear()==year)
                  System.out.println("Finding car by Year:"+carDto[i]);
          }
      }
       public  void findCarByColor(String color){
           for (int i = 0; i < carDto.length; i++) {
               if (carDto[i].getColor()==color)
                   System.out.println("Finding Car by Color:"+carDto[i]);
           }
       }
       public void findCarByEngineType(String engineType){
           for (int i = 0; i <carDto.length ; i++) {
               if (carDto[i].getEngineType()==engineType)
                   System.out.println("Finding EngineType by EngineType:"+carDto[i]);
           }
       }

}
