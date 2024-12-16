let display = document.getElementById("display");
let numberBtn = document.querySelectorAll(".number");
console.log(numberBtn);
function clearDisplay() {
  display.value = "";
}
function appendToDisplay(input) {
  display.value += input;
}
function appendToDisplayNegation(input) {
  display.value = input + display.value;
}
function calculate() {
  try {
    display.value = eval(display.value);
  } catch (error) {
    display.value = "Error";
  }
  /* for (let i = 0; i <= 9; i += 1) {
    numberBtn[i].addEventListener("click", () => {
      display.value = 8;
      appendToDisplay(numberBtn[i].value);
    });
    numberBtn[i].addEventListener("click", () => {
    //  appendToDisplay(input);
    });
    
  }*/
}

//empecher les bouttons de s'ajouter aux résultats du calcul
// faire la fonction %
