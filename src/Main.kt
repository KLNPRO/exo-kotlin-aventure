import degat
import javax.swing.text.PlainView

/*exercice 1*/
fun total(defense: Int,type:Int,qualité:Int):Int {
    val score = defense+type+qualité
        return (score)

}
/*exercice 2 et 3*/
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
}
/*exercice 4*/
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

}


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
}




