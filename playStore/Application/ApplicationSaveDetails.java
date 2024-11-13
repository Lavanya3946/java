package com.xworkz.playStore.Application;

public class ApplicationSaveDetails {
    ApplicationDto applicationDto[]=new ApplicationDto[5];
    int index=0;

    public  String  applicationDetailsSave(ApplicationDto dto) {
        if (dto != null) {
            applicationDto[index] = dto;
            index++;
            return "data is saved";
        } else {
            return "data is not saved";
        }
    }
           public void read(){
            for (int index = 0; index < applicationDto.length; index++) {
                System.out.println(applicationDto[index]);

            }

        }
        public void findApplicationById(int id)
        {
            for (int i=0;i<applicationDto.length;i++)
            {
                if(applicationDto[i].getId()==id){
                    System.out.println("application data by id:"+applicationDto[i]);
                }
            }
        }
        public  void findApplicationByName(String name){
            for (int i = 0; i <applicationDto.length ; i++) {
                if(applicationDto[i].getName()==name){
                    System.out.println("Application Data By Name"+applicationDto[i]);
                }

            }
            

        }

    }





