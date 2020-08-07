package todoapp;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Reader {
  public List<String> readFile() {
    try {
      Path filePath = Paths.get("D:\\Second chance\\GreenFox\\Mosi013-todo-app\\assets\\Tasks.txt");
      return Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
    }
    return null;
  }
}