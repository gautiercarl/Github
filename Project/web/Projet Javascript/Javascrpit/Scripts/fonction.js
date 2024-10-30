//modeMots
function modeJeux() {
  let e = 3;
  let score = 0;
  let listeProposition = listeMots;
  let i = 0;

  afficherProposition(i, listeProposition);

  let motUser = baliseInputEcriture.value;
  baliseBtnValiderMot.addEventListener("click", () => {
    motUser = baliseInputEcriture.value;
    //let motUser = prompt("Entrez le mot: " + listeMots[i]);

    if (listeProposition[i] === motUser) {
      console.log(motUser);
      {
        if (i < listeFélicitations.length) {
          console.log(listeFélicitations[i]); // implémenter l'espace félicitations et vie
        } else {
          console.log("Félicitations!");
        }
      } // rendre les deux listes indépendantes
      score += 1;
      i += 1;
      afficherScore(score);
      afficherProposition(i, listeProposition);
    } else if (listeProposition[i] !== motUser) {
      console.log(motUser);
      console.log("dommage, vous avez fait une erreur recommencer");

      e -= 1;
      console.log("tentatives restante: " + e);
    }

    if (i >= listeMots.length || e === 0) {
      baliseBtnValiderMot.disabled = true;
    }
    if (e === 0) {
      baliseZoneProposition.innerText = "Dommage essaie encore ";
    }
    baliseInputEcriture.value = "";
  });
  for (let index = 0; index < baliseBtnRadio.length; index++) {
    baliseBtnRadio[index].addEventListener("change", (event) => {
      console.log(event.target.value);
      let choix = event.target.value;
      i = 0;
      e = 3;
      baliseBtnValiderMot.disabled = false;
      score = 0;
      afficherScore(score);
      if (choix === "1") {
        listeProposition = listeMots;
      } else {
        listeProposition = listePhrase;
      }
      afficherProposition(i, listeProposition);
    });
  }
  afficherScore(score);
  // console.log("score: " + score);
  btnPartager.addEventListener("click", () => {
    popup.style.display = "inline";
  });
  popup.addEventListener("click", (event) => {
    // lire les click sur l'espace popup
    if (event.target.closest("form")) {
      return;
    } else {
      popup.style.display = "none";
    }
  });

  formular.addEventListener("submit", (event) => {
    event.preventDefault();
    let nom = baliseNom.value;
    let email = baliseEmail.value;
    console.log(nom);
    console.log(email);
    validerNomEtEmail(nom, email);
  });
  changeNomEtEmail(baliseNom, baliseEmail);
  /*document.addEventListener("click", (event) => {
    if (event.target.closest("footer")) {
      console.log("hallo");
    }
  });*/
}

//modephrase

/*function modePhrase(listePhrase) {
  let i = 0;
  let e = 3;
  let score = 0;
  console.log("Bienvenu dans le mode Phrase");

  zonePropositionPhrase(i, listePhrase);
  let phraseUser = baliseInputEcriture.value;
  baliseBtnValiderMot.addEventListener("click", () => {
    phraseUser = baliseInputEcriture.value;
    //let motUser = prompt("Entrez le mot: " + listeMots[i]);

    if (phraseUser !== "0") {
      if (listePhrase[i] === phraseUser) {
        console.log(phraseUser);
        {
          if (i < listeFélicitations.length) {
            console.log(listeFélicitations[i]);
          } else {
            console.log("Félicitations!");
          }
        } // rendre les deux listes indépendantes
        score += 1;
        i += 1;
        afficherScore(score);
        zonePropositionPhrase(i, listePhrase);
      } else if (listePhrase[i] !== phraseUser) {
        console.log(phraseUser);
        console.log("dommage, vous avez fait une erreur recommencer");

        e -= 1;
        console.log("tentatives restante: " + e);
        zonePropositionPhrase(i, listePhrase);
      }
    }
    if (phraseUser === "0") {
      jeux();
      // break;
    }
    if (i >= listePhrase.length || e === 0) {
      baliseBtnValiderMot.disabled = true;
    }
    if (e === 0) {
      baliseZoneProposition.innerText = "Dommage essaie encore ";
    }
    baliseInputEcriture.value = "";
  });

  afficherScore(score);
  // console.log("score: " + score);
}
*/
/*function modePhrase(listePhrase) {
  i = 0;
  let a = 0;
  let e = 3;
  console.log("Bienvenu dans le mode Phrase");
  while (a >= 0 && i < listePhrase.length && e > 0) {
    //let phraseUser = prompt("Entrez le mot: " + listePhrase[i]);

    if (phraseUser !== "0") {
      if (listePhrase[i] === phraseUser) {
        console.log(phraseUser);
        {
          if (i < listeFélicitations.length) {
            console.log(listeFélicitations[i]);
          } else {
            console.log("Félicitations!");
          }
        } // rendre les deux listes indépendantes
        score += 1;
        i += 1;
      } else if (listePhrase[i] !== phraseUser) {
        console.log(phraseUser);
        console.log("dommage, vous avez fait une erreur recommencer");

        e -= 1;
        console.log("tentatives restante: " + e);
      }
    }
    if (phraseUser === "0") {
      jeux(choix);
      break;
    }
  }
  console.log("score: " + score);
  if (i === listePhrase.length) {
    console.log(" Gagné! essaie encore ");

    jeux(choix);
  }
  if (e === 0) {
    console.log("Dommage essaie encore ");
    jeux(choix);
  }
}
*/
//fonction check mots

function checkMots(m) {
  for (i = 0; i >= 0; i += 1) {
    m = prompt("Entrez le nouveau mot");
    while (listeMots.includes(m) == false && m !== "0") {
      listeMots.push(m);
      console.log("Mot enregistré!");
      console.log(listeMots);
      m = prompt("Entrez le nouveau mot");
    }
    while (listeMots.includes(m) == true && m != "0") {
      console.log("Ce mot existe déja");
      m = prompt("Entrez le nouveau mot");
    }
    if (m === "0") {
      //fonction jeux
      jeux();
    }
  }
}

// fonction check phrase

function checkPhrase(p) {
  for (i = 0; i >= 0; i += 1) {
    p = prompt("Entrez la nouvelle phrase");

    if (listePhrase.includes(p) == false && p != "0") {
      listePhrase.push(p);
      console.log("Phrase enregistrée!");
      console.log(listePhrase);
      p = prompt("Entrez la nouvelle phrase");
    } else if (listePhrase.includes(p) == true && p != "0") {
      console.log("Cette phrase existe déja");
      p = prompt("Entrez la nouvelle phrase");
    } else if (p === "0") {
      //fonction jeux
      jeux();
    }
  }
}

// fonction check Félicitation
function checkFélicitation(f) {
  for (i = 0; i >= 0; i += 1) {
    f = prompt("Entrez la nouvelle Félicitation");

    if (listeFélicitations.includes(f) == false && f != "0") {
      listeFélicitations.push(f);
      console.log("Félicitation enregistrée!");
      console.log(listeFélicitations);
      f = prompt("Entrez la nouvelle Félicitation");
    } else if (listeFélicitations.includes(f) == true && f != "0") {
      console.log("Cette Félicitation existe déja");
      f = prompt("Entrez la nouvelle Félicitation");
    } else if (f === "0") {
      //fonction jeux
      jeux();
    }
  }
}

//mode admin

function modeAdmin(choice) {
  console.log("bienvenu dans le mode administrateur ");
  choice = prompt(
    "taper 1 pour ajouter de nouveaux mots, 2 pour ajouter de nouvelles phrases et 3 pour ajouter des Félicitations , 0 pour sortir"
  );
  if (choice === "1") {
    checkMots(m);
  }

  if (choice === "2") {
    //fonction check phrase
    checkPhrase(m);
  }

  if (choice === "3") {
    // foction check Félicitations
    checkFélicitation(m);
  }

  if (choice === 0) {
    //fonction jeux
    jeux();
  }
}

//fonction jeux
function jeux() {
  modeJeux();

  /* if (baliseModeMots.checked) {
    modeMots(listeMots);
    baliseModeMots.addEventListener("click", () => {
      modeMots(listeMots);
    });
  }
  if (baliseModePhrase.checked) {
    baliseModePhrase.addEventListener("click", () => {
      modePhrase(listePhrase);
    });
  }*/
  //choix = prompt( "Tapez 1 pour le mode MOTS ou 2 pour le mode PHRASE et 0 pour annuler");
  /* while (choix !== "1" && choix !== "2" && choix !== "0" && choix !== "#12") {
    // choix = prompt( "Tapez 1 pour le mode MOTS ou 2 pour le mode PHRASE et 0 pour annuler");
  }
  if (choix === "#12") {
    //fonction qui permet à l'administrateur d'ajouter des mots, phrase et félicitation
    modeAdmin(choice);
  }

  if (choix === "1") {
    modeMots(listeMots);
  }

  if (choix === "2") {
    modePhrase(listePhrase);
  }
  if (choix === "0") {
  }
  */
}

function afficherScore(score) {
  let p = `

    <p>Votre score : <span>${score}</span> </p>


    `;
  baliseZoneScore.innerHTML = p;
  //console.log(score);
  /*
let afficherScore= document.querryselector( .zoneScore span)
   *let resultat=`${score}/ ${listeMot.lenght}`
afficherScore.innertext= ${score} or resultat
  */
}

function afficherProposition(i, listeProposition) {
  if (i < listeProposition.length) {
    let proposition = `${listeProposition[i]}`;
    console.log(proposition);
    baliseZoneProposition.innerText = proposition;
  } else {
    let mot = " Gagné! essaie encore ";
    baliseZoneProposition.innerText = mot;
  }
}
/*function zonePropositionPhrase(i, listePhrase) {
  if (i < listePhrase.length) {
    let Phrase = `${listePhrase[i]}`;
    baliseZoneProposition.innerText = Phrase;
  } else {
    let Phrase = " Gagné! essaie encore ";
    baliseZoneProposition.innerText = Phrase;
  }
}*/

function validerNomEtEmail(nom, email) {
  let regxNom = new RegExp("^[a-z]+[a-z]$");
  let resultatNom = regxNom.test(nom);
  let regxMail = new RegExp("[a-z0-9._-]+@[a-z0-9._-]+.[a-z0-9._-]+");
  let resultatEmail = regxMail.test(email);
  console.log(resultatNom);
  console.log(resultatEmail);

  if (resultatNom == true && resultatEmail == true) {
    popup.style.display = "none";
  } else {
    if (resultatNom == false) {
      baliseNom.classList.add("error");
    }
    if (resultatEmail == false) {
      baliseEmail.classList.add("error");
    }
  }
}

function changeNomEtEmail(baliseNom, baliseEmail) {
  baliseNom.addEventListener("change", () => {
    let nom = baliseNom.value;
    let email = baliseEmail.value;
    validerNomEtEmail(nom, email);
  });
  baliseEmail.addEventListener("change", () => {
    let nom = baliseNom.value;
    let email = baliseEmail.value;
    validerNomEtEmail(nom, email);
  });
}
