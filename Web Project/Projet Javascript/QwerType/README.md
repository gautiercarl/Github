# AzerType - Typing Speed Training Application

AzerType is an interactive web application designed to help users improve their typing speed. The game offers two modes: **Words** and **Phrases**, where users need to type the displayed text as quickly and accurately as possible.

## Features

- **Two Modes**: 
  - **Words Mode**: Type individual words from a predefined list.
  - **Phrases Mode**: Type complete sentences from a predefined list.
- **Score Tracking**: Keeps track of the player's score as they type correctly.
- **Attempts Counter**: Players have a limited number of attempts for each word/phrase. If they make a mistake, their attempts decrease.
- **Popup Sharing**: After completing a round, players can share their score via email.
- **Admin Mode**: Allows administrators to add new words, phrases, or congratulatory messages to the game.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/azer-type.git
Navigate to the project directory:

     ```
     cd azer-type
     ```
2. Open the index.html file in a web browser:


   ```
   open index.html
   ```
Alternatively, you can host it on a local server.

## 
Usage
Select the desired mode by choosing Words or Phrases.
Type the word or phrase displayed in the input field.
Press the "Valider" button to check your input.

If correct, your score increases, and a new word/phrase appears. If incorrect, you have fewer attempts.
After finishing, share your score by clicking the "Partager" button and entering your name and email.
Admin Mode
The admin mode allows you to add new words, phrases, and congratulatory messages:

Select Admin Mode from the menu (if implemented).
Use the prompts to enter new words, phrases, or congratulations.
Ensure the inputs are unique; duplicate entries will be rejected.
Code Structure
index.html: The main HTML file that structures the page.
index.css: The styling for the application.
Scripts/config.js: Configuration for the game (e.g., setting up initial lists).
Scripts/fonction.js: The core game logic, handling user inputs, scoring, and mode switching.
Scripts/main.js: Initializes and runs the game by managing event listeners and gameplay.

## Contributing
Contributions are welcome! If you'd like to improve the project, feel free to submit a pull request or open an issue.

## License
This project is open-source and available under the MIT License. See the LICENSE file for more details.

