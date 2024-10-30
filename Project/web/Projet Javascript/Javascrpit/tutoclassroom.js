


//Opération sur les variable
let totalLivres=500

totalLivres+=50
totalLivres-=10
totalLivres+=5
//console.log(totalLivres)

let affichageTotalLivres="Notre bibliothèque possède "+totalLivres
affichageTotalLivres+=" livres"
//console.log(affichageTotalLivres)

//Notion d'objet

let ticket={
    nomFilm: "Demon Slayer le village des forgerons",
    prix: 5000,
    numeroSalle: 12,

}
ticket.date="15.06.2024"
ticket.heure="16h30"
let nom="Gautier"

let  texteAffichage= "Bonjour " +nom +", votre film " +ticket.nomFilm+" est en salle " + ticket.numeroSalle+" et est prevu le "+ ticket.date+ " à "+ ticket.heure

//console.log(texteAffichage)

// Notion de tableaux

const Playlist=[ "Sprinter", "All of me","Meridian" ]
let totalMorceaux= Playlist.length

Playlist.push("Snooze","Goodness of God")// Ajoute des éléments
Playlist.pop()// retire
console.log(Playlist)
