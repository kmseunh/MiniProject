package com.example;

import java.util.List;

public class Compare {
    public int count(List<Integer> lotto, List<Integer> insert) {
        int result = 0;
        for (int i = 0; i < lotto.size(); i++) {
            if (lotto.contains(insert.get(i))) {
                result += 1;
            }
        }
        return result;
    }
}
