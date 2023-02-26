package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    public List<Integer> userNumber(){
        System.out.println("숫자를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        List<Integer> userNum = new ArrayList<>();
        String input = scanner.nextLine();

        for (String number: input.split(" ")) {
            userNum.add(Integer.parseInt(number));
        }
        return userNum;
    }
}
