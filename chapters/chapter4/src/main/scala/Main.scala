package Chapter4

object MainChapter4{
  val answer1 = "Il est possible de stocker un Int dans un Double mais la reciproque n'est pas possible et genere une erreur de type  type mismatch"
  val answer2 = "Si on assigne la valeur d'une variable a une autre et qu'on modifie cette derniere cela n'affectera pas la premiere.Ceci est du au fait que scala utilise generalement le passage par valeur."
  val answer3 = "Avec Scala on peut creer plusieurs variables sur une meme ligne a condition de les separer par un point virgule."
  val listAnswer = List(answer1,answer2,answer3)
  def display={
    var i4:Int=1
    for (answer<-listAnswer){
      println(s"$i4 - $answer")
      i4=i4+1
    }
  }
}