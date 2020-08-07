package todoapp;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Writer {
  public void writeFile(List<String> content) {
    try {
      Path filePath = Paths.get("D:\\Second chance\\GreenFox\\Mosi013-todo-app\\assets\\Tasks.txt");
      Files.write(filePath, content);
    } catch (Exception e) {
      System.out.println("Uh-oh, could not write the file!");
    }
  }
}

