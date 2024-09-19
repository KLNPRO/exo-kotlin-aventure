import kotlin.random.Random


/*exercice 1
fun total(defense: Int,type:Int,qualité:Int):Int {
    val score = defense+type+qualité
        return (score)

}*/


/*exercice 2 et 3
fun déstotal (nombre:Int,faces: Int): Int {
    val jetdedés = (nombre..faces * nombre).random()
    return jetdedés
}


fun degat(nombredés:Int, nombrefaces: Int, bonusQualiteArmes: Int,activation: Int,multiplicateur:Int): Int{

    var valeurDegats = 0
    val jetDeDés = déstotal(nombredés, nombrefaces)
    if (jetDeDés >= activation) {
        valeurDegats = jetDeDés * multiplicateur
    }
    valeurDegats+=bonusQualiteArmes
    if (jetDeDés< 0) {
        valeurDegats = 0
    }

        return valeurDegats
}*/

/*exercice 4
fun attaque(pv: Int,total: Int,degat: Int,nomAttaque:String,NomCible: String){
    var score = degat-total
    var result = 0
    if(score>= 0){
       result =pv-score
        if (result< 0)
            result = 0
    }

    var difPv=pv-result

    return println("$nomAttaque detruit  $NomCible pour $difPv")

}*/
/*Exercice 5
fun boirePotion(NomPersonnageCible: String,Nombrepv: Int,pvmaximum: Int,puissancepotion: Int) {
    var exPV = Nombrepv

    var nouveauxpv = Nombrepv + puissancepotion
    if (nouveauxpv > pvmaximum)
        nouveauxpv = pvmaximum
    println("$NomPersonnageCible boit une potion est récupere ${nouveauxpv-exPV}")

}*/
/*exercice 6
fun bouleDeFeu(NomCaster: String,NomCible: Int,ScoreattaqueCaster: Int,ScoredefenseTotaleCible: Int,NombrepvCible: Int){

val numDice = NomCaster / 3

    // Calculate the total damage dealt
    val degat = (1..numDice).sumOf { Random.nextInt(1, 7) } - ScoredefenseTotaleCible

    // Ensure damage is not negative
    val dernierdegat = if (degat > 0) degat else 0

    // Store the original HP of the target
    val originalHp = NombrepvCible

    // Apply the damage to the target's HP
    val newHp = NombrepvCible - dernierdegat

    // Ensure HP does not go below 0
    val finalHp = if (newHp > 0) newHp else 0

    // Print the message
    println("$NomCaster lance une boule de feu et inflige $dernierdegat points de dégâts à $NomCible.")
}*/

fun main(){
    /*exercice 2 et 3 print
    print(déstotal(4,8))
    print(degat(1,6,2,6,2))*/
    /*exercice 4 print
    print(attaque(5,2,9,"killian","evan"))*/

/*exercice 1 print
    print(total(3,2,1))
    assert(total(3,2,1) == 6){
        "Erreur la valeur est de ${total(3,2,1)}"
    }*/
    /*exercice 5
    print(boirePotion("killian",18,20,6))*/
}




