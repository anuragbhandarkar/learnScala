object helloWorld {
  def main(args: Array[String]):Unit = {
    println("Hello World")
    println("Hello World 1")
//    var result = addWithoutReturn(2,5)
var result = addD(2,5)
//    println("Addition of 2 and 5 is : " + result)
//    println("Addition of 2 and 5 is : " + result)
      println("Addition of 2 and 5 is : " + result)
  }
  def add(x:Int, y:Int): Int = {
    var z = x + y
    return  z
  }

  // Specify return type but not specifying return keyword
  def addWithoutReturn(x:Int, y:Int) = {
    var z = x + y
    z
  }

  def addD(x:Int, y:Int) = x + y
}
