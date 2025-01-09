package com.xworkz.travellingapp.runner;

import com.xworkz.travellingapp.interfaces.Pen;

public class PenRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Pen prod = () -> {
            return true;
        };
        boolean isAvailable = prod.isAvailable();
        System.out.println("Is product is available: "+isAvailable);
        System.out.println("Main ended");
    }
}
