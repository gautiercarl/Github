package ToDoList;

import java.util.*;
import java.io.*;

public class ToDoList {
    ArrayList<String> taskList = new ArrayList<>();
    String task;
    Scanner scanner = new Scanner(System.in);
    private static final String BACK_UP = "ToDoList/task.txt"; // nur eine Kopie für alle Instanzen

    // Aufgaben in Datei speichern
    private void saveTasks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(BACK_UP))) {
            for (String task : taskList) {
                writer.write(task);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    // Aufgaben aus Datei laden
    private void loadTasks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(BACK_UP))) {
            String line;
            while ((line = reader.readLine()) != null) {
                taskList.add(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("No previous tasks found. Starting fresh!");
        } catch (IOException e) {
            System.out.println("Error loading tasks: " + e.getMessage());
        }
    }

    // Methode zum Hinzufügen einer Aufgabe
    public void addTask() {

        System.out.println("Add a new task: ");
        task = scanner.nextLine();
        taskList.add(task);
        System.out.println("The task has been saved");
        saveTasks();
    }

    // Methode zum Anzeigen aller Aufgaben
    public void showTask() {
        if (taskList.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            System.out.println("Your task");
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println((i + 1) + "- " + taskList.get(i));
            }
        }

    }

    // Methode zum Löschen einer Aufgabe
    public void removeTask() {
        showTask();

        boolean invalidInput = true;
        while (invalidInput) {
            try {
                System.out.println("which task do you want to delete ? ");
                int taskNummer = scanner.nextInt();
                scanner.nextLine();
                if (taskNummer > 0 && taskNummer <= taskList.size()) {
                    String removedTask = taskList.remove(taskNummer - 1);
                    System.out.println("the task has been deleted: " + removedTask);
                    invalidInput = false;
                    saveTasks();
                } else {
                    System.out.println("that nummer doesn't exist");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                
            }
        }

    }

    // Hauptmenü der To-Do-Liste
    public void menu() {
        loadTasks();
        boolean running = true;
        int choice = 0;
        while (running) {
            System.out.println("Welcome to the to do list what do you want to do? ");
            System.out.println("1. Add a task");
            System.out.println("2. Show all task");
            System.out.println("3. Delete a task");
            System.out.println("4. Quit");
            System.out.print("Choose a Option: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            }

            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    showTask();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    System.out.println(" End of the programm");
                    running = false;
                    break;

                default:
                    System.out.println("the choice is not available please try again");

            }

        }

    }

}