# To-Do List Application

## Overview
This project is a simple, interactive to-do list application built with HTML, CSS, and JavaScript. It allows users to add, mark as complete, and delete tasks. The application also saves the task list in the browser's local storage, ensuring tasks persist between sessions.

## Features
- **Add Tasks**: Users can add new tasks via an input field.
- **Mark Complete**: Clicking on a task toggles a "checked" state, visually marking it as complete.
- **Delete Tasks**: Each task includes a delete button (×) to remove it.
- **Persistent Data**: Tasks are saved in `localStorage`, so they remain after a page refresh or browser restart.

## Files
### 1. `index.html`
The main HTML structure of the application. Includes:
- An input field and button for adding tasks.
- An unordered list (`<ul>`) where tasks are displayed dynamically.

### 2. `toDoList.css`
The CSS file that styles the application. Suggested styles include:
- A visually appealing layout.
- Distinct styling for completed tasks (`checked` class).
- Styling for the delete button (×).

### 3. `toDoList.js`
The JavaScript file that powers the application's functionality. Includes:
- Event handling for adding, marking, and deleting tasks.
- Functions for saving and loading tasks from `localStorage`.

## Usage
1. Clone the repository or download the files.
2. Open `index.html` in any modern web browser.
3. Use the input field to add tasks, click tasks to mark them complete, or use the × button to delete tasks.

## How It Works
1. **Adding Tasks**:
   - The `addTask` function is triggered when the "Add" button is clicked.
   - Validates input to ensure the task is not empty.
   - Creates a new `<li>` element and appends it to the task list.

2. **Marking and Deleting Tasks**:
   - An event listener on the task list (`taskList`) handles clicks.
   - Clicking a task toggles its `checked` class.
   - Clicking the × button deletes the task.

3. **Saving and Loading Data**:
   - Tasks are saved to `localStorage` as the inner HTML of the `<ul>` element.
   - On page load, the `showTask` function loads saved tasks from `localStorage`.

## Enhancements
- **Accessibility**: Add `aria-labels` or roles for better screen reader support.
- **Keyboard Support**: Enable adding tasks by pressing the Enter key.
- **Error Handling**: Ensure graceful handling if `localStorage` is unavailable or corrupted.

## License
This project is licensed under the MIT License. Feel free to use, modify, and distribute it as you like.
