package com.epam;

import java.util.ArrayList;
import java.util.List;

public class Wheel {
    private List<Integer> usedNumbers;

    public Wheel(int countNumbers) {
        usedNumbers = new ArrayList<>();
        for (int i = 0; i <= countNumbers; i++) {
            usedNumbers.add(i);
        }
    }

    public int winNumber(){
        int randomIndex = (int) (usedNumbers.size() * Math.random());
        int winNumber = usedNumbers.get(randomIndex);
        usedNumbers.remove(randomIndex);
        return winNumber;
    }
}
