
modeMots(listeMots)




function modeMots(listeMots) {
    let motUser=" " 
   let a=0
    let e =3
  console.log("Bienvenu dans le mode Mots")
while(  a>=0 && i<listeMots.length && e>0 &&motUser!=="0"){
   motUser= prompt("Entrez le mot: " +listeMots[i])
  
if(motUser!=="0" )
{
  


if(listeMots[i]===motUser &&motUser!=="0"){
console.log(motUser)
 {if(i<listeFélicitations.length){
 console.log(listeFélicitations[i]) }
 else{console.log("Félicitations!")}
 } // rendre les deux listes indépendantes
score+=1
i+=1

}

else if(listeMots[i]!==motUser &&motUser!=="0"){
console.log(motUser)
console.log("dommage, vous avez fait une erreur recommencer")

e-=1
console.log("tentatives restante: "+e )
 }
}
}
if(motUser==="0"){
console.log("score: "+score)
jeux(choix)

}
console.log("score: "+score)




}