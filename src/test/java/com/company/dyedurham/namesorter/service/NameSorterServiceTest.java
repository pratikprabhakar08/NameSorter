package com.company.dyedurham.namesorter.service;

import com.company.dyedurham.namesorter.writer.NameSorterFileWriter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

class NameSorterServiceTest {

    @Mock
    private NameSorterFileWriter sorterFileWriter;

    @Mock
    private SortService sortService;

    @InjectMocks
    private NameSorterService nameSorterService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void sortName_ValidFile_CallsSortServiceAndFileWriter() throws IOException {
        // Arrange
        String fileName = "test.txt";
        List<String> unsortedNames = new ArrayList<>();
        unsortedNames.add("John Doe");
        unsortedNames.add("Alice Smith");
        List<String> sortedNames = new ArrayList<>();
        sortedNames.add("Alice Smith");
        sortedNames.add("John Doe");

        when(sortService.sortNamesByLastName(unsortedNames)).thenReturn(sortedNames);

        // Act
        nameSorterService.sortName(fileName);

        // Assert
        verify(sortService, times(1)).sortNamesByLastName(unsortedNames);
        verify(sorterFileWriter, times(1)).writeFile(sortedNames);
    }

    @Test
    void sortNamesByLastName_invalidInput_throwException() throws IOException {
        String fileName = "test1.txt";

        when(sortService.sortNamesByLastName(new ArrayList<>())).thenReturn(new ArrayList<>());

        // Act
        nameSorterService.sortName(fileName);
    }
}
