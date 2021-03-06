class A
{
   final void makeApplesauce()
   {
	   System.out.println("the superclass final method");
   }
}

class B extends A
{
   void makeApplesauce(int numberOfApples)
   {
	   System.out.println("The subclass and overload an inherited method");
   }

  void makeApplesauce()
   {
   }
/*
16: makeApplesauce() in B cannot override makeApplesauce() in A; overridden method is final
   void makeApplesauce()
*/
}

class FinalMethodDemo
{
   public static void main(String[] args)
   {
	   System.out.println("main is executing");
	   A myA = new A();
	   myA.makeApplesauce();
	   B myB = new B();
	   myB.makeApplesauce();
   }
}