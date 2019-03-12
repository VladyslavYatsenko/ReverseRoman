package com.company.yatsenko;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    private StringBuilder romanRepresentation = null;

    public List<Integer> digitsInNumber(int number) {
        List<Integer> result = new ArrayList<>();
        int factor = 1;
        while (number != 0) {
            result.add(number % 10 * factor);
            number = number / 10;
            factor *= 10;
        }
        return result;
    }
}
