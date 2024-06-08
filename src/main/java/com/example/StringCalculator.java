package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        String delimiter = ",|\n";  // default delimiter

        if (numbers.startsWith("//")) {
            Matcher m = Pattern.compile("//(.*?)\n(.*)").matcher(numbers);
            if (m.matches()) {
                delimiter = Pattern.quote(m.group(1));
                numbers = m.group(2);
            }
        }
        String[] nums = numbers.split(delimiter);
        int sum = 0;
        for (String num : nums) {
            if (!num.isEmpty()) {
                int number = Integer.parseInt(num);
                sum += number;
            }
        }
        return sum;
    }

}
