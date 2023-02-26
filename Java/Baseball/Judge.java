package org.example;

import java.util.List;

public class Judge {
    Compare compare = new Compare();

    public String judgement(List<Integer> computer, List<Integer> user) {
        int total = compare.count(computer, user);
        int strike = compare.countStrike(computer, user);
        int ball = total - strike;

        if (total == 0) {
            return "0S 0B";
        } else if (strike == 0) {
            return ball + "Ball";
        } else if (ball == 0) {
            return strike + "Strike";
        }
        return strike + "S" + "" + ball + "B";
    }
}
