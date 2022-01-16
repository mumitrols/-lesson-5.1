package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void taskConditionTest() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int leftBorder = 200;
        int rightBorder = 300;
        int expected = 3;

        // вызываем целевой метод:
        long actual = service.countingSquaresOfNumbers(leftBorder, rightBorder);
        System.out.println("Квадратов чисел в диапазоне "+actual);

        // Результат проверки
        assertEquals(expected, actual);
    }
    @Test
    void  firstLowerBorderTest() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int leftBorder = 0;
        int rightBorder = 99;
        int expected = 0;

        // вызываем целевой метод:
        long actual = service.countingSquaresOfNumbers(leftBorder, rightBorder);
        System.out.println("Квадратов чисел в диапазоне "+actual);

        // Результат проверки
        assertEquals(expected, actual);
    }
    @Test
    void  secondLowerBorderTest() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int leftBorder = 0;
        int rightBorder = 100;
        int expected = 1;

        // вызываем целевой метод:
        long actual = service.countingSquaresOfNumbers(leftBorder, rightBorder);
        System.out.println("Квадратов чисел в диапазоне "+actual);

        // Результат проверки
        assertEquals(expected, actual);
    }
    @Test
    void  thirdLowerBorderTest() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int leftBorder = 0;
        int rightBorder = 121;
        int expected = 2;

        // вызываем целевой метод:
        long actual = service.countingSquaresOfNumbers(leftBorder, rightBorder);
        System.out.println("Квадратов чисел в диапазоне "+actual);

        // Результат проверки
        assertEquals(expected, actual);
    }
    @Test
    void  firstUpperBorderTest() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int leftBorder = 100;
        int rightBorder = 9801;
        int expected = 90;

        // вызываем целевой метод:
        long actual = service.countingSquaresOfNumbers(leftBorder, rightBorder);
        System.out.println("Квадратов чисел в диапазоне "+actual);

        // Результат проверки
        assertEquals(expected, actual);
    }
    @Test
    void  secondUpperBorderTest() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int leftBorder = 0;
        int rightBorder = 9604;
        int expected = 89;

        // вызываем целевой метод:
        long actual = service.countingSquaresOfNumbers(leftBorder, rightBorder);
        System.out.println("Квадратов чисел в диапазоне "+actual);

        // Результат проверки
        assertEquals(expected, actual);
    }
}