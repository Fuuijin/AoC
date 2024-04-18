package com.fuuijin.aoc;

import com.fuuijin.core.Day;
import com.fuuijin.exceptions.InputException;
import com.fuuijin.interfaces.Mission;
import com.fuuijin.utils.CalibrationDocument;

public class DayOne extends Day implements Mission {
    private final CalibrationDocument calibrationDocument;

    public DayOne(int day, boolean test) throws InputException {
        super(day, test);
        String[] lines = input(this.input);
        this.calibrationDocument = new CalibrationDocument(lines);
    }

    private String[] input(String input) {
        return input.split("\n");
    }

    @Override
    public String first() {
        return calibrationDocument.cleanDocument();
    }

    @Override
    public String second() {
        return "";
    }
}
