package Chapter3

object MainChapter3{
  val answer1 ="Les fonctions disponibles pour les entiers sont: \n" +
    "!=   /    >=          ceil                floor        isNegInfinity   isValidShort          round            toByte        toInt           unary_-\n" +
    "%    <    >>          compare             getClass     isPosInfinity   isWhole               self             toChar        toLong          unary_~ \n" +
    "&    <<   >>>         compareTo           intValue     isValidByte     longValue             shortValue       toDegrees     toOctalString   underlying \n" +
    "*    <=   ^           describeConstable   isInfinite   isValidChar     max                   signum           toDouble      toRadians       until \n" +
    "+    ==   abs         doubleValue         isInfinity   isValidInt      min                   to               toFloat       toShort         | \n" +
    "-    >    byteValue   floatValue          isNaN        isValidLong     resolveConstantDesc   toBinaryString   toHexString   unary_+\n" +
    "Le String ont egalement plusieurs fonctions dont voici quelques unes\n" +
    "*                 collectFirst          filterNot         init                  mkString              reverse           stripMargin     toLowerCase\n" +
    "+                 combinations          find              inits                 nonEmpty              reverseIterator   stripPrefix     toMap\n" +
    "++                companion             flatMap           intern                offsetByCodePoints    reverseMap        stripSuffix     toSeq\n" +
    "++:               compare               flatten           intersect             orElse                runWith           stripTrailing   toSet\n" +
    "+:                compareTo             fold              isBlank               padTo                 sameElements      subSequence     toShort\n" +
    "/:                compareToIgnoreCase   foldLeft          isDefinedAt           par                   scan              substring       toStream"
  val answer2 = "Si on assigne la valeur d'une variable a une autre et qu'on modifie cette derniere cela n'affectera pas la premiere.Ceci est du au fait que scala utilise generalement le passage par valeur."
  val answer3 = "Avec Scala on peut creer plusieurs variables sur une meme ligne a condition de les separer par un point virgule."
  val listAnswer = List(answer1,answer2,answer3)
  def display={
    var i3:Int=1
    for (answer<-listAnswer){
      println(s"$i3 - $answer")
      i3=i3+1
    }
  }
}