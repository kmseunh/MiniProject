package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    public List<Integer> insertNumber() {
        System.out.println("번호를 6개 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        List<Integer> insertNum = new ArrayList<>();
        String input = scanner.next();

        for (int i = 0; i < 6; i++) {
            insertNum.add(Integer.parseInt(input));
        }
        return insertNum;
    }
}
