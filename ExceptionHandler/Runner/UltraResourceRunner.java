package com.xworkz.ExceptionHandler.Runner;

import com.xworkz.ExceptionHandler.TryCatchExample.UltraResource;

public class UltraResourceRunner {
    public static void main(String[] args) {
        try (UltraResource resource = new UltraResource()) {
          resource.connect();
          resource.use();
        } catch (Exception e) {
            System.out.println("exception" + e.getMessage());
        }
    }
}
