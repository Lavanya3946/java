package com.xworkz.Runner;

import com.xworkz.Internal.Festival;

public class FestivalRunner {
    public static void main(String[] args) {
        Festival festival1=new Festival("Divali", "01-11-2024","lakmi");
        Festival festival2=new Festival("Divali", "01-11-2024","lakmi");
        Festival festival3=new Festival("dasara", "11-10-2024","chamundeshwari");
        System.out.println("festival1 is equals to festival3:"+festival1.equals(festival3));
        System.out.println("festival1 is equals to festival2:"+festival1.equals(festival2));
    }
}
