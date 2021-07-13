package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1st Task: Loops
        // write a program that counts indescending order from 100-0
        //Print out only the values that are divisible by 6.
      /*  for (int i = 100; i > 0; i--){
            if (i % 6 == 0) {
                System.out.println(i);
            }
        } */

        // 2nd Task:Average
        // Write a program that takes input from the user for 10 numbers and
        // find the average of those numbers.
    /* int size = 10;
        double sum = 0;
        double average = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 10 numbers: ");

        for(int i = 0; i < size; i++) {
        int number = scanner.nextInt();
            sum += number;
        }
            System.out.println(sum);

        average = sum / size;
          System.out.println(average);*/


        //3rd Task: Strings
        //Write a program that takes in 5 Strings from the user
        // and concatenates those strings into one sentence.
       /* Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your String: ");

        String one = scanner1.nextLine();
        String two = scanner1.nextLine();
        String three = scanner1.nextLine();
        String four = scanner1.nextLine();
        String five = scanner1.nextLine();

        System.out.println( one + " " + two + " " + three + " " + four + " " + five);*/

        //OR
     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of strings you want to enter: ");
        String[] strings = new String[scanner.nextInt()];
        scanner.nextLine();

        for(int i = 0; i < strings.length; i++) {
            System.out.print("Enter your string: ");
            strings[i] = scanner.nextLine();

        }
        System.out.println("Your message is here: ");
        for(String str: strings) {
            System.out.print(str + " ");
        }*/



        //4th Task: Write a program that allows takes in 10 numbers as an array
        //finds the largest number.
      /*  int size = 10;
        int i;
        int[] numbers = new int[size];
        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < size; i++){
        System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();

        }
        int max  = numbers[0];
        for (i = 0; i < size; i++){
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The biggest number is: " + max);*/


        // 5thTask:
    //Using an array, output the number of odd numbers
        //out of the numbers a user has entered. i.e. allow the
        //user to enter a number of numbers and return or output the number of numbers.
        //Enter how many numbers you want: 6
        //Enter a number
        //Enter a number
        //...
        //the number of odd number is...
      /*  Scanner num = new Scanner(System.in);
        System.out.println("Enter how many numbers you want: ");
        int[] numbers = new int[num.nextInt()];


        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter a number: ");
            numbers[i] = num.nextInt();
         }
            for (int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 != 0 ){
                System.out.println("The number of odd numbers is " + i);
            }

        }*/



        //6th Task:
        //Create a class called Vehicle. Let this car have features like,
        //length of the vehicle, the number of seats,
        //no of tires, name/brand of the vehicle, current speed.

        //methods include: speed up(increases speed by 5),
        //slow down (reduce speed by 5), start engine, stop engine.
        Vehicle vehicle = new Vehicle();
        vehicle.setCurrentSpeed(60);
        vehicle.setLength(200);
        vehicle.setName("BMW");
        vehicle.setNoOfSeats(4);
        vehicle.setNoOfTires(4);
        vehicle.startEngine(true);
        vehicle.setSpeed2(65);
        System.out.println("This is " + vehicle.getName() +  ", it is "  + vehicle.getLength()
                + " cm and have " + vehicle.getNoOfSeats() + " seats. ");
        System.out.println("Vehicle current speed is " + vehicle.getCurrentSpeed() + ". ");
        vehicle.speedUP();



    }
   }

