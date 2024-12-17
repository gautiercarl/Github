# EnemyKill Game

## Overview
EnemyKill is a simple Java game where the player must locate and destroy enemy positions hidden on a grid. The player has a limited number of shots (missiles) to eliminate all enemies. The game is designed as a command-line interaction and includes basic logic for input validation, random enemy placement, and tracking player attempts.

---

## Features
- Randomly generated enemy positions.
- Player input validation to ensure proper coordinates.
- Tracking of previously attempted positions to avoid duplicates.
- Victory and defeat conditions:
  - Victory: All enemies are eliminated.
  - Defeat: The player runs out of missiles.
- Feedback after each shot indicating a hit or miss.

---

## Gameplay
1. The game randomly places 3 enemy positions on a grid (indices from 0 to 7).
2. The player has 5 shots to find and destroy all enemies.
3. The player enters coordinates (numbers between 0 and 7) to fire a shot.
4. Feedback is provided:
   - **Hit**: If the player's shot matches an enemy position.
   - **Miss**: If there is no enemy at the chosen coordinate.
   - **Duplicate Attempt**: If the player has already tried the chosen position.
5. The game ends when:
   - All enemies are destroyed, or
   - The player runs out of shots.

---

## How to Run
1. Ensure you have [Java installed](https://www.oracle.com/java/technologies/javase-downloads.html) on your system.
2. Save the game code in a file named `EnemyKill.java`.
3. Compile the code:
   ```
   javac EnemyKill.java
   ```
4. Run the game:
   ```
   java EnemyKill
   ```
5. Follow the on-screen instructions to play.

---

## Code Structure
### Main Classes and Methods
- **`EnemyKill`**:
  - Main class containing game logic.
  - Handles enemy placement, player input, and game flow.

- **Methods**:
  - `setEnemyLocation()`: Randomly generates and stores enemy positions.
  - `setChoice()`: Handles player input and validates it.
  - `compareChoice(int choice)`: Compares the player’s input against enemy positions.
  - `playGame()`: Orchestrates the main game loop.

---

## Example Output
### Victory Scenario
```
Enter the coordinates for your shot (0-7):
1
Nothing here. Try again.
Remaining shots: 4

Enter the coordinates for your shot (0-7):
3
Bingo! You hit an enemy.
Remaining shots: 3

Enter the coordinates for your shot (0-7):
4
Bingo! You hit an enemy.
Remaining shots: 2

Enter the coordinates for your shot (0-7):
5
Bingo! You hit an enemy.
We have killed all the enemies.
```

### Defeat Scenario
```
Enter the coordinates for your shot (0-7):
0
Nothing here. Try again.
Remaining shots: 4

Enter the coordinates for your shot (0-7):
6
Nothing here. Try again.
Remaining shots: 3

Enter the coordinates for your shot (0-7):
7
Nothing here. Try again.
Remaining shots: 2

Enter the coordinates for your shot (0-7):
3
Nothing here. Try again.
Remaining shots: 1

Enter the coordinates for your shot (0-7):
2
Nothing here. Try again.
We don’t have missiles anymore, my general.
```

---

## Future Improvements
1. **Enhanced Gameplay**:
   - Add multiple levels with increasing difficulty.
   - Allow variable grid sizes.
2. **User Experience**:
   - Provide a visual grid representation.
   - Use colors for hits/misses (e.g., using libraries for terminal graphics).
3. **Statistics**:
   - Track player performance across games.
4. **Graphical Interface**:
   - Create a GUI using JavaFX or Swing.

---

## Contributing
Contributions are welcome! Feel free to submit issues or pull requests to enhance the game.

---

## License
This project is open-source and available under the [MIT License](https://opensource.org/licenses/MIT).
