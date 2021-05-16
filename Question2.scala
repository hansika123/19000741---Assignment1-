object Question2 extends App
{
  println("Calculate the value of a sphere\n ")
  val r = 5

  val volume = (4.0/3.0)+ ( math.Pi ) * ( math.pow(r,3) )
  println("The volume is : " + f"$volume%1.2f")
}
