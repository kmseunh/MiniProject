package com.example;

import java.util.List;

public class App {
    public static void main(String[] args) {
        GenerateRandomNum generateRandomNum = new GenerateRandomNum();
        Input input = new Input();
        Money money = new Money();

        while (true) {
            List<Integer> lotto = generateRandomNum.create();
            String result = "";

            result = money.MoneyResult(lotto, input.insertNumber());
            System.out.println(lotto);
            System.out.println(result);
            break;
        }
    }
}
