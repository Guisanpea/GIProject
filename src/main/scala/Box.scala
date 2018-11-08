object Box extends App{
  override def main(args: Array[String]): Unit = {
    def getLongest = {
      var longest = 0
      for (arg <- args) {
        if (arg.length > longest)
          longest = arg.length
      }
      longest
    }

    val longest: Int = getLongest

    def mark() : Unit = {
      for (i <- Range(0, longest + 4)) {
        print('*')
      }
    }

    mark()

    println()
    for (arg <- args){
      print("* ")
      print(arg)
      for (i <- Range(0, longest - arg.length)){
        print(' ')
      }
      print(" *")
      println()
    }
    mark()
  }


}
