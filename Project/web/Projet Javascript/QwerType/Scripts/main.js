//les boucles

console.log("Hello world");
//liste de mots et phrases

let m = " ";
let p = " ";
let f = " ";
let choix = " ";
let choice = " ";

let baliseInputEcriture = document.getElementById("inputEcriture");
console.log(baliseInputEcriture);

let baliseBtnValiderMot = document.getElementById("btnValiderMot");
console.log(baliseBtnValiderMot);

let baliseZoneProposition = document.querySelector(".zoneProposition");
console.log(baliseZoneProposition);

let baliseZoneScore = document.querySelector(".zoneScore");
console.log(baliseZoneScore);

let baliseBtnRadio = document.querySelectorAll(".optionSource input"); // input[type="radio"]
console.log(baliseBtnRadio);
let baliseModeMots = document.getElementById("mots");
let baliseModePhrase = document.getElementById("phrases");
let btnPartager = document.querySelector(".partager");
let popup = document.querySelector(".popupBackground");
let main = document.querySelector("main");
let formular = document.querySelector("form");
let baliseNom = document.getElementById("nom");
let baliseEmail = document.getElementById("email");

jeux();
