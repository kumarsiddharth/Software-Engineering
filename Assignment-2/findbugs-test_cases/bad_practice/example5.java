//This is another bad practice. The coder wants to override the method eat but actually not overriding it
class Human
{
   public void eat()
   {
      System.out.println("Human is eating");
   }
}
class Boy extends Human
{
	public void eat(String food)
	{
	      System.out.println("Boy is eating "+food);
	}
}
class MainsClass
{
   	public static void main( String args[])
	{
     		 Boy obj = new Boy();
      		obj.eat("noodles");
   	}
}


