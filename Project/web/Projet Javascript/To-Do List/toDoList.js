const insertTask = document.getElementById("task");
const taskList = document.getElementById("taskList");

function addTask() {
  let newTask = insertTask.value;
  if (newTask === "") {
    alert("write something");
  } else {
    console.log(newTask);
    let li = document.createElement("li");
    li.innerHTML = newTask;
    taskList.appendChild(li);
    // create a cross after a line
    let span = document.createElement("span");
    span.innerHTML = "\u00d7";
    li.appendChild(span);
    saveData();
  }
  insertTask.value = "";
}

// change the style of li element by click (cross and checked, delete with span) and save data
taskList.addEventListener(
  "click",
  (e) => {
    if (e.target.tagName === "LI") {
      e.target.classList.toggle("checked");
      saveData();
    } else if (e.target.tagName === "SPAN") {
      e.target.parentElement.remove();
      saveData();
    }
  },
  false
);
// create a local storage

function saveData() {
  localStorage.setItem("data", taskList.innerHTML);
}
function showTask() {
  taskList.innerHTML = localStorage.getItem("data");
}
showTask();
