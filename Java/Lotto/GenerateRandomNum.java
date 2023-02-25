package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandomNum {
    public int makeNum() {
        Random random = new Random();
        return random.nextInt(45) + 1;
    }

    public List<Integer> create(){
        List<Integer> lotto = new ArrayList<>();
        while(lotto.size() < 6){
            int lottomake = makeNum();
            if(lotto.contains(lottomake)){
                continue;
            }else{
                lotto.add(lottomake);
            }
        }
        return lotto;
    }
}
