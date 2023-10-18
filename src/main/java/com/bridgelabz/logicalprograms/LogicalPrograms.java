package com.bridgelabz.logicalprograms;

import java.util.ArrayList;
import java.util.List;

public class LogicalPrograms {

    public boolean isPrimeNumber(int num) {

        int count = 0;
        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {

            return true;
        } else {
            return false;
        }

    }


    public int isFibonacciSeries(int num) {
        int a = 0, b = 1, c = 0;
        for (int i = 1; i <= num; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (num == sum) {
            return true;
        }
        return false;


    }

    public int reverseOfANumber(int num) {
        int rem, rev = 0;
        int temp = num;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;

        }

        return rev;
    }

    public boolean generateStopWatch() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        long elapseTime = endTime - startTime;
        if (elapseTime == 0) {
            return false;
        }
        return true;
    }

    public int couponNumbers(int howManyCoupon) {

        int count = 0;
        int min = 100;
        int max = 999;
        System.out.println("Coupon Number : ");
        for (int i = 0; i < howManyCoupon; i++) {
            int couponNumber = (int) (Math.random() * (max - min) + min);

            count++;

        }


        return count;
    }


    public List<Integer> findMinNotes(int amount, List<Integer> change) {

        int[] notes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        if (amount == 0) {
            return change;
        }

        for (int note : notes) {
            if (amount >= note) {
                change.add(note);
            }
        }
        return change;
    }

    public List<Integer> getChange(int amount) {
        List<Integer> change = new ArrayList<>();
        return findMinNotes(amount, change);
    }

    public double monthlyPayment(double P, int y, double R) {
        double n = 12 * y;
        System.out.println(n);
        double r = (R / 100) / 12;
        System.out.println(r);

        double payment = (P * r) / 1 - (Math.pow(1 + r, n * (-1)));
        System.out.println(payment);
        return payment;
    }

    public double tempratureClaculation(double temp, String scale) {
        if (scale.equalsIgnoreCase("C")) {
            return (temp * 9 / 5);
        } else if (scale.equalsIgnoreCase("F")) {
            return (temp - 32) * 5 / 9;

        }
        System.out.println(temp);
        return 0.0;
    }

    public double squareRootCalculation(double c) {
        if (c < 0) {
            return 0.0;
        }

        double t = c;
        double epsilon = 1e-15;

        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2;
        }

        return t;
    }


    public static void main(String[] args) {

        LogicalPrograms obj = new LogicalPrograms();
        // obj.couponNumbers(899);
        //obj.monthlyPayment(10000, 7, 6.5);
        obj.tempratureClaculation(45.4, "C");
        obj.squareRootCalculation(25.5);


    }


    public int toBinaryString(int number) {
        String binary = Integer.toBinaryString(number);
        String swappedBinary = swapNibbles(binary);
        return Integer.parseInt(swappedBinary, 2);
    }

    public String swapNibbles(String binary) {
        if (binary.length() < 8) {
            binary = "0".repeat(8 - binary.length()) + binary;
        }

        String nibble1 = binary.substring(0, 4);
        String nibble2 = binary.substring(4, 8);

        return nibble2 + nibble1;
    }
}





