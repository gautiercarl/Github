let monthName = document.getElementById("month-name");
let dayName = document.getElementById("day-name");
let dayNumber = document.getElementById("day-number");
let year = document.getElementById("year");

const date = new Date();

console.log(date);

monthName.innerText = date.toLocaleString("en", {
  month: "long",
});

dayName.innerText = date.toLocaleString("en", {
  weekday: "long",
});

dayNumber.innerText = date.getDate();

year.innerText = date.getFullYear();
