package com.company.dyedurham.namesorter.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortServiceTest {

    @InjectMocks
    SortService sortService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void sortNamesByLastName_ValidInput_ReturnsSortedNames() {
        // Arrange
        List<String> unsortedNames = new ArrayList<>();
        unsortedNames.add("John Doe");
        unsortedNames.add("Alice Smith");
        unsortedNames.add("Beau Tristan Bentley");
        unsortedNames.add("Marin Alvarez");
        unsortedNames.add("Vaughn Lewis");

        List<String> expectedSortedNames = new ArrayList<>();
        expectedSortedNames.add("Marin Alvarez");
        expectedSortedNames.add("Beau Tristan Bentley");
        expectedSortedNames.add("John Doe");
        expectedSortedNames.add("Vaughn Lewis");
        expectedSortedNames.add("Alice Smith");

        // Act
        List<String> sortedNames = sortService.sortNamesByLastName(unsortedNames);

        // Assert
        assertEquals(expectedSortedNames, sortedNames);
    }
}

