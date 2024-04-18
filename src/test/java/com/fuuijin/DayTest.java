package com.fuuijin;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.fuuijin.core.Day;
import com.fuuijin.exceptions.InputException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DayTest {
    private Day day;

    @BeforeEach
    void setUp() throws InputException {
        day = new Day(1, false);
    }

    @Test
    void test_loadInput() throws IOException, InputException {
        day.loadInput(1, false);
        String expectedInput = Files.readString(Path.of("src/main/resources/01.txt"));
        assertEquals(expectedInput, day.input);
        day.loadInput(1, true);
        expectedInput = Files.readString(Path.of("src/test/resources/01.txt"));
        assertEquals(expectedInput, day.input);
    }

    @Test
    void invalidDay() {
        assertThrows(InputException.class, () -> day.loadInput(0, false));
    }

    @Test
    void fileNotFound() {
        assertThrows(InputException.class, () -> day.loadInput(100, false));
    }
}