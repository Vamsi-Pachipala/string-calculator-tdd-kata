package com.example;

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
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }

}
