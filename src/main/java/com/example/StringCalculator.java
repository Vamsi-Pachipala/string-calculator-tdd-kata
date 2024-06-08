package com.example;

/**
 * Hello world!
 *
 */
public class StringCalculator
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to string calculator" );
    }

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(numbers);
    }

}
