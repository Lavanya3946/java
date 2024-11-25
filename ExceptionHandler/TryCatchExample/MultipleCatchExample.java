package com.xworkz.ExceptionHandler.TryCatchExample;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int [] numbers={1,2,3};
            System.out.println(numbers[5]);
            int result=10/0;
            System.out.println(result);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index is out of bounds!");
            System.out.println("Exception message:"+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Arthamatic error!");
            System.out.println("Exception message:"+e.getMessage());
        } catch (Exception e) {
            System.out.println("Some exception Occured!");
            System.out.println("Exception message:"+e.getMessage());
        }
    }
}
