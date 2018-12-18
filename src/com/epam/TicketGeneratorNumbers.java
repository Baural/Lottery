package com.epam;

import java.util.*;


public class TicketGeneratorNumbers {
    private List<Integer> rangeNumbers = new ArrayList<>();

    public TicketGeneratorNumbers(int sizeRangeNumbers) {
        for (int i = 1; i <= sizeRangeNumbers; i++) {
            rangeNumbers.add(i);
        }
    }

    public Set<Integer> generate(int countNumbers){
        Collections.shuffle(rangeNumbers);
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < countNumbers; i++) {
            numbers.add(rangeNumbers.get(i));
        }
        return numbers;
    }

    public List<Integer> getRangeNumbers() {
        return rangeNumbers;
    }

    public void setRangeNumbers(List<Integer> rangeNumbers) {
        this.rangeNumbers = rangeNumbers;
    }
}

