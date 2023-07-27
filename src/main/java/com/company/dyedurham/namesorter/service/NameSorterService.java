package com.company.dyedurham.namesorter.service;

import com.company.dyedurham.namesorter.writer.NameSorterFileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NameSorterService {

  @Autowired
  private final SortService sortService;

  public NameSorterService(SortService sortService) {
    this.sortService = sortService;
  }

  public void sortName(String fileName) throws IOException {
    List<String> unsortedNames = new ArrayList<>();
    List<String> sortedNames;

    String lines;
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
      while ((lines = bufferedReader.readLine()) != null) {
        unsortedNames.add(lines);
      }
      if (unsortedNames.isEmpty()) {
        throw new IllegalArgumentException("Name cannot be empty or blank.");
      }
    }
    sortedNames = this.sortService.sortNamesByLastName(unsortedNames);

    // Write sorted names to the file
    try {
      NameSorterFileWriter.writeFile(sortedNames);
    } catch (IOException e) {
      log.error("Exception occurred during writing file: {}", e.getMessage());
    }

    // Print out sorted names to the screen.
    log.info("Sorted list: \n{}", String.join("\n", sortedNames));
  }
}
