package com.xworkz.ExceptionHandler.TryCatchExample;

public class MultiCatchExample {
    public static void main(String[] args) {
        try{
            int[] numbers={1,2,3};
            System.out.println(numbers[2]);
            int result=10/0;
            System.out.println(result);
        }catch (ArithmeticException |ArrayIndexOutOfBoundsException e){
            System.out.println("Exception:"+e.getMessage());
        }
    }
}
