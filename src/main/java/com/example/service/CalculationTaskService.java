package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class CalculationTaskService {
    
    // for square of number
    public int square (int num){
        return num * num;
    }

    // for cube of number
    public int cube (int num){
        return num * num * num;
    }

    // check isEven
    public boolean isEven(int number){
        return number % 2 == 0;
    }

    // check number isPrime
    public boolean isPrimeOrNot(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // check number isArmstrong
    public boolean isArmstrong(int num){
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        boolean isArmstrong = original == sum;
        return isArmstrong;
    }

    // check number isPalindrome
    public boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;
        int temp = num;
        while (temp!= 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        boolean isPalindrome = original == reverse;
        return isPalindrome;
    }
    
    // factorial of number
    public Integer factorial(int num){
        int fact = 1;
        for(int i = 2; i <= num; i++){ 
            fact = fact * i;
        }
        return fact;
    }

    // reverse number
    public int reverse(int num){
        int reverse = 0;
        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num/ 10;
        }
        return reverse;
    }
    
}
