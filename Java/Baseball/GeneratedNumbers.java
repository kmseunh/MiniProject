package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratedNumbers {
    public int makeNum() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

    public List<Integer> create() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 3) {
            int numbermake = makeNum();
            if (!numbers.contains(numbermake)) {
                numbers.add(numbermake);
            }
        }
        return numbers;
    }
}
