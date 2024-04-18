package com.fuuijin;

import com.fuuijin.aoc.DayOne;
import com.fuuijin.exceptions.InputException;

public class Main {
    public static void main(String[] args) throws InputException {
        DayOne dayOne = new DayOne(1, false);
        System.out.println(dayOne.first());
    }
}