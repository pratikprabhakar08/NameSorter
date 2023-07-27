package com.company.dyedurham.namesorter.service;

import java.util.Comparator;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SortService {

  public List<String> sortNamesByLastName(List<String> names) {
    names.sort(Comparator.comparing(SortService::extractLastName));
    return names;
  }

  private static String extractLastName(String fullName) {
    String[] nameParts = fullName.split(" ");
    return nameParts[nameParts.length - 1];
  }
}
