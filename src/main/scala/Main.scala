import Chapter1.MainChapter1
import Chapter2.MainChapter2
import Chapter3.MainChapter3
import Chapter4.MainChapter4
import Chapter5.MainChapter5
object Main{
  def newChap(n:Int)={
    println("Type Enter to continue")
    val test =scala.io.StdIn.readLine
    println("   ")
    println(s"  ****************************************************************Chapitre ${n}****************************************************************")
    println("   ")
  }
  def main(args: Array[String]): Unit ={
    println("   ")
    println("SCALA PROGRAMMING FOR BIG DATA ANALYTICS")
    newChap(1)
    MainChapter1.display
    newChap(2)
    println(MainChapter2.display)
    newChap(3)
    println(MainChapter3.display)
    newChap(4)
    println(MainChapter4.display)
    newChap(5)
    println(MainChapter5.display)
    prinln("--------------------------------------------------------------------------------------------------------")
  }
}