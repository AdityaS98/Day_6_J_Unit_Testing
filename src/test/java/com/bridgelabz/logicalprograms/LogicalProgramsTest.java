package com.bridgelabz.logicalprograms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class LogicalProgramsTest {

    LogicalPrograms obj = new LogicalPrograms();

    @Test

    public void checkWhetherGivenNumberIsPrimeOrNot() {

        boolean res = obj.isPrimeNumber(7);
        Assertions.assertTrue(res);
        boolean res1 = obj.isPrimeNumber(8);
        Assertions.assertFalse(res1);

        Assertions.assertEquals(true, res);
        Assertions.assertEquals(false, res1);
    }

    @Test
    public void checkForTheFibonacciSeries() {

        int res = obj.isFibonacciSeries(8);

        Assertions.assertEquals(8, res);
    }


    @Test
    public void checkWhetherTheNumberIsPerfectOrNot() {
        boolean res = obj.isPerfectNumber(28);
        boolean res1 = obj.isPerfectNumber(19);
        Assertions.assertTrue(res);
        Assertions.assertFalse(res1);

    }

    @Test
    public void findTheReverseOfANumber() {
        int res = obj.reverseOfANumber(147);
        int res1 = obj.reverseOfANumber(123);

        Assertions.assertEquals(741, res);
        Assertions.assertEquals(321, res1);
    }

    @Test
    public void checkForTheStopWatchTimeCalculation() {

        boolean res = obj.generateStopWatch();
        Assertions.assertTrue(res);


    }

    @Test
    public void checkForCorrectCouponNumber() {
        int res = obj.couponNumbers(5);
        Assertions.assertEquals(5, res);
    }

    @Test

    public void checkForFindingNotesInTheVendingMachine() {
        int amount = 1952;
        List<Integer> expectChange = Arrays.asList(500, 200, 100, 50, 20, 10, 5, 2, 1);
        List<Integer> actualchange = obj.getChange(amount);
        Assertions.assertEquals(expectChange, actualchange);
    }

    @Test

    public void checkForFindingMonthlyPayments() {
        double priciple = 10000;
        int years = 7;
        double iR = 6.5;
        double expectedMonthlyPayment = 53.531439207156126;
        double actualMonthlyPayment = obj.monthlyPayment(priciple, years, iR);
        Assertions.assertEquals(expectedMonthlyPayment, actualMonthlyPayment);
    }

    @Test

    public void checkForTempratureCalculation() {
        double tem = 45.5;
        double expectedFahrenheit = 81.9;

        double actualFahrenheit = obj.tempratureClaculation(tem, "C");
        Assertions.assertEquals(expectedFahrenheit, actualFahrenheit);
    }

    @Test
    public void checkForTheSqaureRootCalculation() {
        double value = 25.5;
        double squarerootexpected = 5.049752469181039;
        double squarerootactual = obj.squareRootCalculation(value);
        Assertions.assertEquals(squarerootexpected, squarerootactual);
    }

    @Test
    public void testSwapNibbles() {
        int number = 100;
        int expectedSwappedNumber1 = 70;
        int actualSwappedNumber1 = obj.toBinaryString(number);
        Assertions.assertEquals(expectedSwappedNumber1, actualSwappedNumber1);
    }

}