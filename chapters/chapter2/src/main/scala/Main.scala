package Chapter2

object MainChapter2{
  val answer1 = "Pour installer scalla sur linux en offline il faut avoir l'archive de sbt le decompresser ensuite configurer le path"
  val answer2 =":help [command]          permet de demander l'aide pour une commande specifique \n" +
    ":history [num]          montre l'historique des commandes qu'on a utilise \n" +
    ":h? <string>             rechercher un mot specifique dans l'historique \n" +
    ":line <id>|<line>        place les lignes a la fin de l'historique \n" +
    ":load <path>             permet d'executer les lignes de codes dans un fichier dont le chemin d'acces est reseigne \n" +
    ":paste [-raw] [path]     c'est le mode qui permet d'executer plusieurs lignes de code simultanement \n" +
    ":quit                    quitter scala \n" +
    ":replay [options]        redemarrer repl et executer toutes les precedentes commandes \n" +
    ":reset [options]         reinitialiser le relp \n" +
    ":settings <options>      donne les details tels que l'encodage \n" +
    ":silent                  gerer l'affichage automatique des resultats des differentes operations \n" +
    ":type [-v] <expr>        donne le type d'une expression \n" +
    ":kind [-v] <expr>        donne le type du type d'une expression(Ici c'est plus general que le type) \n" +
    ":warnings                donne le dernier warning"
  val listAnswer = List(answer1,answer2)
  def display={
    var i2:Int=1
    for (answer<-listAnswer){
      println(s"$i2 - $answer")
      i2=i2+1
    }
  }
}