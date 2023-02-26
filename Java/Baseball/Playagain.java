package org.example;

import java.util.Scanner;

public class Playagain {
    public boolean playagain() {
        System.out.println("정답입니다!");
        System.out.println("경기를 다시 시작하시겠습니까?? 다시 시작:1, 종료: 2");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (answer == 1) {
            return true;
        }
        return false;
    }
}
