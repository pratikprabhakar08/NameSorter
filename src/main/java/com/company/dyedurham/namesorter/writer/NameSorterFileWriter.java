package com.company.dyedurham.namesorter.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class NameSorterFileWriter {

  public static void writeFile(List<String> al) throws IOException
  {
    String filePath = System.getProperty("user.dir");
    String fileSeparator = System.getProperty("file.separator");
    FileWriter fileWriter = new FileWriter(filePath + fileSeparator + "sorted-names-list.txt");
    PrintWriter printWriter = new PrintWriter(fileWriter);
    for (String str: al) {
      printWriter.println(str);
    }
    printWriter.close();
  }

}
