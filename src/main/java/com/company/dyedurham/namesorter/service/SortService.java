package com.company.dyedurham.namesorter.service;

import java.util.Comparator;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SortService {

  public List<String> sortNamesByLastName(List<String> names) {
    names.sort(Comparator.comparing(SortService::extractLastName));
    return names;
  }

  private static String extractLastName(String fullName) {
    String[] nameParts = fullName.split(" ");
    return nameParts.length == 1 ? nameParts[0] : nameParts[nameParts.length - 1];
  }
}
