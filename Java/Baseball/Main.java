package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GeneratedNumbers generatedNumbers = new GeneratedNumbers();
        Input input = new Input();
        Judge judge = new Judge();
        Playagain playagain = new Playagain();
        boolean again = true;

        while (again) {
            List<Integer> computer = generatedNumbers.create();
            String result = "";
            while (!result.equals("3Strike")){
                result = judge.judgement(computer, input.userNumber());
                System.out.println(result);
            }
            again = playagain.playagain();
        }
    }
}