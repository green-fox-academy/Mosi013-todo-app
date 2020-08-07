package todoapp;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Remover {
  public void removeTask(String[] args) {
    if (args.length == 1) {
      System.out.println("Unable to remove: no index provided");
    } else {
      try {
        int deleteTask = Integer.parseInt(args[1]);
        List<String> tasks = new Reader().readFile();
        if (deleteTask > tasks.size()) {
          System.out.println("Unable to remove: index is out of bound");
        } else if (tasks.size() >= 2) {
          deleteTask--;
          for (int i = 0; i < tasks.size(); i++) {
            if (i == deleteTask) {
              tasks.remove(i);
            }
          }
          new Writer().writeFile(tasks);
        }
      } catch (Exception e) {
        System.out.println("Unable to remove: index is not a number");
      }
    }
  }
}
