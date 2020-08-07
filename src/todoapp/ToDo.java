package todoapp;


import java.util.List;

public class ToDo {
  public static void main(String[] args) {
    List<String> tasks;
    if (args.length == 0) {
      new Printer();

    } else if (args[0].equals("-l")) {
      tasks = new Reader().readFile();
      new ListTask().listTasks(tasks);

    } else if (args[0].equals("-a")) {
      new AddNewTask().addNewTask(args);

    } else if (args[0].equals("-r")) {
      new Remover().removeTask(args);

    } else if (args[0].equals("-c")) {
      new Checker().checkTask(args);

    } else {
      System.out.println("Unsupported argument");
    }
  }
}
