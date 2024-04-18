package com.fuuijin.utils;

public class CalibrationDocument {
    private final String[] lines;

    public CalibrationDocument(String[] lines) {
        this.lines = lines;
    }

    public String cleanDocument() {
        int result = 0;

        for (String line : lines) {
            StringBuilder number = new StringBuilder();

            for (Character c : line.toCharArray()) {
                if (Character.isDigit(c)) {
                    number.append(c);
                    break;
                }
            }

            for (int i = line.length() - 1; i >= 0; i--) {
                char c = line.charAt(i);
                if (Character.isDigit(c)) {
                    number.append(c);
                    break;
                }
            }

            result += Integer.parseInt(number.isEmpty() ? "0" : number.toString());
        }

        return Integer.toString(result);
    }
}
