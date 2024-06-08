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
        String[] nums = numbers.split(",");
        if (nums.length == 1) {
            return Integer.parseInt(numbers);
        }
        return Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
    }

}
