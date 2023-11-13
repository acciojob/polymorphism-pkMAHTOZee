package com.driver;

// Step 1: Create a class named Product inside Main class
public class Main {
    public static class Product {
        // Step 3: Create a method with the given definition
        public int product(int x, int y) {
            return x * y;
        }

        // Step 4: Create an overloaded method with the given definition
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Step 5: Create another overloaded method with the given definition
        public double product(double x, double y) {
            return x * y;
        }
    }

    // Step 2: Create an object of Product in the main method
    public static void main(String[] args) {
        Product p = new Product();

        // Step 3: Call the method from Main using Product class object p
        int result1 = p.product(2, 3);
        System.out.println("Result of product(int x, int y): " + result1);

        // Step 4: Call the overloaded method from Main using Product class object p
        int result2 = p.product(2, 3, 4);
        System.out.println("Result of product(int x, int y, int z): " + result2);

        // Step 5: Call the another overloaded method from Main using Product class object p
        double result3 = p.product(2.5, 3.5);
        System.out.println("Result of product(double x, double y): " + result3);
    }
}
