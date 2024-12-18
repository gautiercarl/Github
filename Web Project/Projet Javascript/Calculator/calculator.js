let display = document.getElementById("display");

// Löscht die Anzeige
function clearDisplay() {
  display.value = "";
}

// Fügt Eingaben zur Anzeige hinzu
function appendToDisplay(input) {
  if (display.value.length < 20) { // Begrenze auf 20 Zeichen
    display.value += input;
  } else {
    alert("Maximum input length reached");
  }
}

// Negiert die aktuelle Eingabe
function appendToDisplayNegation() {
  if (display.value.startsWith("-")) {
    display.value = display.value.substring(1);
  } else {
    display.value = "-" + display.value;
  }
}

function calculatePercentage() {
  try {
    // Prüfen, ob der Display-Inhalt ein gültiger Ausdruck ist
    const value = parseFloat(display.value);
    if (!isNaN(value)) {
      // Prozentsatz berechnen
      display.value = value / 100;
    } else {
      display.value = "Error";
    }
  } catch (error) {
    display.value = "Error";
  }
}

// Führt die Berechnung durch
function calculate() {
  try {
    let result = Function(`"use strict"; return (${display.value})`)();
    display.value = result;
  } catch (error) {
    display.value = "Error";
  }
}

// Event-Listener für die Buttons
document.querySelectorAll(".number").forEach((btn) => {
  btn.addEventListener("click", () => {
    appendToDisplay(btn.innerText);
  });
});

document.query
