package Chapter5

object MainChapter5{
  val answer1 = "C'est possible de transformer une variable numeruqi ou booleenne en String en utilisant la fonction toString"
  val answer2 = "Lorsqu'on caste un Double en Entier ce qui est retourne c'est la partie entiere du double"
  val answer3 = "Maintenat nous allons expliquer la difference entre Nil,Null,Nothing,Unit,None\n" +
    "null est la valeur d'une référence qui ne fait référence à aucun objet \n" +
    "Null est le type de la référence null . Il étend tous les types de référence, y compris les classes personnalisées et les traits que nous définissons. Cela nous permet d'utiliser la valeur null à la place de n'importe quel type de référence.\n" +
    "Nil est une liste d'objets singleton vide qui étend le type List  \n" +
    "None est un sous-type du type Option il peut etre utilise dans les match cases au cas ou il n'y a pas d'option \n" +
    "Unit est le type de retour des fonctions ne retournant rien . Il est équivalent au type void en Java à une différence près : le type Unit dans Scala a une valeur singleton qui est () , mais void en Java n'a aucune valeur \n" +
    "n'est le type absolu sans valeur dans Scala. Il n'a pas de méthodes ou de valeurs.Tout type est la racine de l'ensemble du système de type Scala, et Nothing étend le type Any . Par conséquent, nous pouvons utiliser Nothing à la place de n'importe quel type Scala, à la fois les types de référence et les types de valeur. "
  val listAnswer = List(answer1,answer2,answer3)
  def display={
    var i5:Int=1
    for (answer<-listAnswer){
      println(s"$i5 - $answer")
      i5=i5+1
    }
  }
}