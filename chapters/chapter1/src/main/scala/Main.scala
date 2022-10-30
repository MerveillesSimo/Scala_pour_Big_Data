package Chapter1

object MainChapter1{
  val answer1 = "Le Bytecode est un code de programmation orientee objet (OOP) compile pour s'executer sur une machine virtuelle (VM) au lieu d'une unite centrale de traitement (CPU); \n" +
    "La machine virtuelle Java ou JVM est le composant de la plate-forme Java qui execute les programmes ;\n " +
    "L'environnement de developpement Java ou JRE cree la machine virtuelle Java ou JVM et s'assure que les dependances sont disponibles pour les programmes Java ;\n " +
    "Le kit de developpement Java ou JDK permet de creer des programmes Java qui peuvent etre executes par la JVM et le JRE."
  val answer2 = "Scala a ete conçu pour montrer qu'une fusion de la programmation fonctionnelle et orientee objet est possible et pratique et efficace.\n" +
    "Le code est plus concis et lisible. Il est facile d'ecrire, de compiler, de deboguer et d'executer le programme dans Scala, par rapport à de nombreux autres langages de programmation.\n" +
    ""
  val answer3 = "Apache Spark est un moteur d'analyse unifie et ultra-rapide pour le traitement de donnees a grande echelle. Il permet d'effectuer des analyses de grande ampleur par le biais de machines de Clusters. Il est essentiellement dedie au Big Data et Machine Learning. \n" +
    "En plus de sa rapidite due a l'ecriture en memoire, un autre avantage de Spark sur MapReduce, sa relative facilite d'utilisation et sa flexibilite."
  val answer4 = "Le big data est utilise pour: \n" +
    "L'analyse des comportements de l'utilisateur \n" +
    "La detection des fraudes \n" +
    "LaSupport de prediction\n" +
    " segmentation des consommateurs \n" +
    "Systeme de recommandation"
  val answer5 = "Scala est generalement utilise dans le traitement de donnees,le calcul distribue et le devellopement web"
  val answer6 = "Scala est utilise par certaines grndes entreprises telles que: Twitter,Linkdin,Netflix,Tumblr,airBnB principalement pour l'evolutivite,l'efficacite, la rapidite et la simplicite"
  val answer7 = "	Python ne peut tout simplement pas suivre Scala en matiere de performances à grande echelle. En tant que langage de script interprete, les performances de Python n'evoluent tout simplement pas comme Scala, car il doit etre traduit pour s'executer sur des systemes distribues."
  val listAnswer = List(answer1,answer2,answer3,answer4,answer5,answer6,answer7)
  def display={
    var i1:Int=1
    for (answer<-listAnswer){
      println(s"$i1 - $answer")
      i1=i1+1
    }
  }
}