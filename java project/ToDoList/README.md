# ToDoList Application

## Overview
The ToDoList application is a simple Java program that allows users to manage their tasks using a command-line interface. Users can add, view, and delete tasks, with the functionality to save and load tasks from a file for persistence.

---

## Features
- **Task Management**:
  - Add tasks to the to-do list.
  - Display all tasks in the list.
  - Remove specific tasks from the list.
- **Data Persistence**:
  - Save tasks to a file (`task.txt`) to ensure tasks are not lost when the program exits.
  - Load tasks from the file when the program starts.
- **Input Validation**:
  - Handles invalid inputs gracefully.
  - Ensures deletion is only possible for valid task numbers.

---

## How to Run
1. Ensure you have [Java installed](https://www.oracle.com/java/technologies/javase-downloads.html) on your system.
2. Save the code in a file named `ToDoList.java` within a folder named `ToDoList`.
3. Compile the program:
  
   ```bash
   javac *.java
   
   
   ```
4. Run the program:
   ```
   java Main.java
   ```
5. Follow the menu options to manage your tasks.

---

## Code Structure
### Main Class: `ToDoList`
- **Instance Variables**:
  - `ArrayList<String> taskList`: Stores the list of tasks.
  - `String task`: Temporarily stores user input for task names.
  - `Scanner scanner`: For capturing user input.
  - `BACK_UP`: A constant file path for saving tasks.

### Methods
- **Task Management**:
  - `addTask()`: Adds a task to the list and saves it to the file.
  - `showTask()`: Displays all tasks in the list.
  - `removeTask()`: Deletes a task by its number and updates the file.

- **File Operations**:
  - `saveTasks()`: Writes all tasks to the file.
  - `loadTasks()`: Reads tasks from the file and loads them into the list.

- **Menu**:
  - `menu()`: Provides the main interaction menu for the user.

---

## Example Usage
### Menu Options
```
Welcome to the to do list what do you want to do? 
1. Add a task
2. Show all task
3. Delete a task
4. Quit
Choose a Option: 
```

### Adding a Task
```
Add a new task: 
Buy groceries
The task has been saved
```

### Viewing Tasks
```
Your task
1- Buy groceries
```

### Deleting a Task
```
Your task
1- Buy groceries
which task do you want to delete ? 
1
the task has been deleted: Buy groceries
```

### Exiting
```
 End of the program
```

---

## Future Improvements
1. **Enhanced User Interface**:
   - Use a graphical interface (e.g., JavaFX or Swing) for better usability.
2. **Advanced Features**:
   - Add task priorities and due dates.
   - Implement search functionality.
3. **Cloud Integration**:
   - Synchronize tasks across devices using a cloud database.
4. **Multi-language Support**:
   - Provide language options for users worldwide.

---

## Contributing
Contributions are welcome! If you have ideas or fixes, feel free to submit issues or pull requests.

---

## License
This project is open-source and available under the [MIT License](https://opensource.org/licenses/MIT).
