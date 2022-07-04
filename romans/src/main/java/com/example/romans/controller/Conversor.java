package com.example.romans.controller;

import static java.lang.String.join;
import static java.util.Collections.nCopies;

public class Conversor {
    int[] decimalsNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    String[] romansNum = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public int[] getDecimalsNum() {
        return decimalsNum;
    }

    public void setDecimalsNum(int[] decimalsNum) {
        this.decimalsNum = decimalsNum;
    }

    public String[] getRomansNum() {
        return romansNum;
    }

    public void setRomansNum(String[] romansNum) {
        this.romansNum = romansNum;
    }

    public String conversor(int number) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < decimalsNum.length; i++) {
            int restInt = number / decimalsNum[i];
            number -= decimalsNum[i] * restInt;
            result.append(join("", nCopies(restInt, romansNum[i])));
        }

        return result.toString();

    }
}

// nCopies: https://www.geeksforgeeks.org/collections-ncopies-java/
//