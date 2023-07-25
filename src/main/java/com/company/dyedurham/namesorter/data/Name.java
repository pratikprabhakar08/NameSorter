package com.company.dyedurham.namesorter.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
@AllArgsConstructor
public class Name {

  @NonNull
  private String fullName;

}
