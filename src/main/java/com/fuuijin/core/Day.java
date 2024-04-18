package com.fuuijin.core;

import com.fuuijin.exceptions.InputException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Day {
  public String input;
  public Day(int day, boolean test) throws InputException {
    loadInput(day, test);
  }
  public void loadInput(int day, boolean test) throws InputException {
    StringBuilder path = new StringBuilder("src/main/resources/");
    StringBuilder test_path = new StringBuilder("src/test/resources/");
    if (test) {
      path = readTestInput(day, test_path);
    } else {
      path.append(day >= 1 && day <= 9 ? String.format("0%d", day) : Integer.toString(day));
      path.append(".txt");
    }

    Path filePath = Path.of(path.toString());
    try (var lines = Files.lines(filePath)) {
      List<String> inputList = lines.toList();
      input = String.join("\n", inputList);
    } catch (IOException e) {
      throw new InputException(String.format("Error reading input for day %d from file %s.", day, filePath));
    }
  }

  private StringBuilder readTestInput(int day, StringBuilder path) {
    path.append(day >= 1 && day <= 9 ? String.format("0%d", day) : Integer.toString(day));
    path.append(".txt");
    return path;
  }
}
