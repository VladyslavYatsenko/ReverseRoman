package com.company.yatsenko;


import com.sun.org.apache.xpath.internal.operations.String;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Representation {
    private Parser parser;

    public Representation(Parser parser) {
        this.parser = parser;
    }

    public StringBuilder representNumber(int number) {
        StringBuilder result = new StringBuilder();
        if (number <= 5999 && number >= 1) {
            List<Integer> integerList = parser.digitsInNumber(number);
            int i = 0;
        } else {
            throw new IllegalArgumentException("Range must be [1;5999]");
        }
        return result;
    }
}
