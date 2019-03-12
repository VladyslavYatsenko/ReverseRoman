package com.company.yatsenko;

public class Main {
    public static void main(String[] args) {
        Representation representation=new Representation(new Parser());
        System.out.println(representation.representNumber(4343));

    }
}
