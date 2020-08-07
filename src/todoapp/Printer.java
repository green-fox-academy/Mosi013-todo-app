package todoapp;

public class Printer {
  public Printer(){
    System.out.println("Command Line Todo Application");
    System.out.println("=============================\n");
    System.out.println("Command line arguments: \n");
    System.out.println("    -l   Lists all the tasks\n" +
        "    -a   Adds a new task\n" +
        "    -r   Removes an task\n" +
        "    -c   Completes an task");
  }
}
