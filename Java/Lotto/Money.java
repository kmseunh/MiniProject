package com.example;

import java.util.List;

public class Money {
    Compare compare = new Compare();
    public String MoneyResult(List<Integer> lotto, List<Integer> insert){
        int correct = compare.count(lotto, insert);

        if (correct == 6){
            return  "1등";
        }else if(correct == 5){
            return "2등";
        }else if (correct == 4) {
            return "3등";
        }else if (correct == 3) {
            return "4등";
        }else{
            return  "당첨되지 못했습니다.";
        }
    }
}
