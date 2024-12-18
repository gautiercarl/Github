# JavaScript Calculator

## Introduction
This project is a simple, interactive calculator built with HTML, CSS, and JavaScript. The calculator supports basic arithmetic operations such as addition, subtraction, multiplication, and division. The design is responsive and visually appealing, with a user-friendly interface.

---

## Features
- **Basic Operations**: Addition (+), Subtraction (-), Multiplication (*), and Division (/).
- **Clear Function**: Reset the display using the "AC" button.
- **Negation**: Toggle between positive and negative values with the "+/-" button.
- **Decimal Support**: Add decimal points to numbers.
- **Keyboard-Free Interaction**: Fully operable through on-screen buttons.

---

## Technologies Used
1. **HTML**: Structure of the calculator.
2. **CSS**: Styling and layout.
   - Grid-based layout for button organization.
   - Responsive design.
3. **JavaScript**: Core functionality and user interaction logic.

---

## File Structure
```
project-folder/
|-- index.html      # Main HTML file
|-- calculator.css  # Styling
|-- calculator.js   # JavaScript logic
```

---

## How to Run the Project
1. Clone the repository or download the files.
2. Open `index.html` in any modern web browser.
3. Interact with the calculator using the on-screen buttons.

---

## Code Highlights
### JavaScript Functions
1. **clearDisplay()**: Resets the display.
   ```javascript
   function clearDisplay() {
     display.value = "";
   }
   ```
2. **appendToDisplay(input)**: Adds numbers or operators to the display.
   ```javascript
   function appendToDisplay(input) {
     if (display.value.length < 20) {
       display.value += input;
     } else {
       alert("Maximum input length reached");
     }
   }
   ```
3. **calculate()**: Safely evaluates the mathematical expression.
   ```javascript
   function calculate() {
     try {
       let result = Function(`"use strict"; return (${display.value})`)();
       display.value = result;
     } catch (error) {
       display.value = "Error";
     }
   }
   ```

---

## Future Improvements
- Add support for more advanced operations (e.g., square root, exponentiation).
- Implement a history feature to store past calculations.
- Improve accessibility for keyboard and screen readers.

---

## Contribution
Feel free to contribute to this project. Fork the repository and submit a pull request with your improvements or suggestions.

---

## License
This project is licensed under the MIT License.

