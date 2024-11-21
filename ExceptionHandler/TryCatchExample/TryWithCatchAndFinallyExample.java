package com.xworkz.ExceptionHandler.TryCatchExample;

public class TryWithCatchAndFinallyExample {
    public static void main(String[] args) {
        try{
            int[] numbers={1,2,3};
            System.out.println(numbers[1]);
            int result=10/0;
            System.out.println("result is :"+result);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds!");
            System.out.println("Exception:"+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Arthamatic Exception!");
            System.out.println("Exception:"+e.getMessage());
        }finally{
            System.out.println("finally excutes always");
        }
    }
}
