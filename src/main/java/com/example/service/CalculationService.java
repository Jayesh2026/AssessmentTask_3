package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class CalculationService {

    public static final Logger logger = LoggerFactory.getLogger(CalculationService.class);

    @Autowired
    CalculationTaskService calculationTask;

    private Scanner sc = new Scanner(System.in);
    private int number;

    public CalculationService() {
        System.out.println("Enter a number: ");
        number = sc.nextInt();
    }

    public void executeTasks() {
        logger.info("Started the executeService");
        try (ExecutorService executorService = Executors.newFixedThreadPool(8))
        {
            executorService.submit(squareTask);
            executorService.submit(cubeTask);
            executorService.submit(factorialTask);
            executorService.submit(armstrongTask);
            executorService.submit(palindromeTask);
            executorService.submit(evenTask);
            executorService.submit(primeTask);
            executorService.submit(reverseTask);
        } catch (Exception e) {
            logger.warn("Error occurred: {}", e.getMessage());
        } finally {
            logger.info("Shutting down the ExecutorService...");
        }
    }

    public Runnable squareTask = () -> {
        int square = calculationTask.square(number);
        logger.info("Square of {} is: {}", number, square);
    };

    public Runnable cubeTask = () -> {
        int cube = calculationTask.cube(number);
        logger.info("Cube of {} is: {}", number, cube);
    };

    public Runnable evenTask = () -> {
        boolean even = calculationTask.isEven(number);
        logger.info("{} is even: {}", number, even);
    };

    public Runnable primeTask = () -> {
        boolean isPrime = calculationTask.isPrimeOrNot(number);
        logger.info("{} is prime: {}", number, isPrime);
    };

    public Runnable armstrongTask = () -> {
        boolean armstrong = calculationTask.isArmstrong(number);
        logger.info("{} is Armstrong: {}", number, armstrong);
    };

    public Runnable palindromeTask = () -> {
        boolean isPalindrome = calculationTask.isPalindrome(number);
        logger.info("{} is palindrome: {}", number, isPalindrome);
    };

    public Runnable factorialTask = () -> {
        Integer factorialNum = calculationTask.factorial(number);
        logger.info("Factorial of {} is: {}", number, factorialNum);
    };

    public Runnable reverseTask = () -> {
        int reversedNum = calculationTask.reverse(number);
        logger.info("Reverse of {} is: {}", number, reversedNum);
    };
}
