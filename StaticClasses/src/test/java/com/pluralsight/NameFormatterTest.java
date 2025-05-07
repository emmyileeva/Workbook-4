package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    void testFormatWithFirstAndLast() {
        String result = NameFormatter.format("John", "Doe");
        assertEquals("Doe, John", result);
    }

    @Test
    void testFormatWithAllNameParts() {
        String result = NameFormatter.format("Mr.", "John", "A", "Doe", "Jr");
        assertEquals("Doe, Mr. John A, Jr", result);
    }

    @Test
    void testFormatWithFullNameAndSuffix() {
        String result = NameFormatter.format("John A Doe, Jr");
        assertEquals("Doe, John A, Jr", result);
    }

    @Test
    void testFormatWithFullNameWithoutSuffix() {
        String result = NameFormatter.format("Mr. John A. Doe");
        assertEquals("Doe, Mr. John A.", result);
    }
}