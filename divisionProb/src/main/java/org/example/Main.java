package org.example;

public class Main {

            public static double divide(double num, double denom) {
                if (denom == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return (num / denom);
            }
            public static void main(String[] args) {
                System.out.println(divide(10,12));
            }

        }

