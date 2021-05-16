object Question3 extends App
{
   val coverPrice = 24.95
   val noOfCopies = 60
   val discount = 40.0/100.0

   def Discount(coverPrice: Double, noOfCopies : Int,discount : Double ): Double = {
      coverPrice * noOfCopies * discount
   }

   def shippingCost (noOfBooks:Int ): Double={
      if (noOfBooks <= 50)3.0
      else 3.0 + (0.75 * (noOfBooks - 50))
   }

   def wholesaleCost(noOfCopies:Int, coverPrice:Double, discount:Double): Double = {
      ((noOfCopies*coverPrice)- Discount(coverPrice,noOfCopies, discount)+ shippingCost(noOfCopies) )
   }

   val wholesaleVal = wholesaleCost(noOfCopies, coverPrice, discount)
   print("Total wholesale cost for 60 copies = ")
   println(f"$wholesaleVal%1.2f")
}
