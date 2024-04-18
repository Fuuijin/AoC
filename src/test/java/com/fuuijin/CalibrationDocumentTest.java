package com.fuuijin;

import com.fuuijin.utils.CalibrationDocument;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalibrationDocumentTest {
  private CalibrationDocument calibrationDocument;

  @BeforeEach
  void setUp() {
    String lines =
        """
                    1abc2
                pqr3stu8vwx
                a1b2c3d4e5f
                treb7uchet
                """;
    calibrationDocument = new CalibrationDocument(lines.split("\n"));
  }

  @Test
  void testCleanDocument() {
    assertEquals("142", calibrationDocument.cleanDocument());
  }
}
