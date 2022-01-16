package ru.netology.sqr;

public class SQRService {
    public int countingSquaresOfNumbers(int leftBorder, int rightBorder) {
        int numberOfSquares = 0;
        for(int i = 10; i <= 99; i++)
        {
            if ((i*i >= leftBorder) && (i*i <= rightBorder))
            numberOfSquares++;
        }
       return numberOfSquares;
    }
}
