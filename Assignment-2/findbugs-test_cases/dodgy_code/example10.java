/*I am trying to generate the following type of error*/
/*useless assignment on return statement*/
class ArithmaticOperation
{
	double add(double a,double b)
	{	
		double c;
		return c=a+b;
	}
	double sub(double a,double b)
	{	
		double c;
		return c=a-b;
	}	
	double mul(double a,double b)
	{	
		double c;
		return c=a*b;
	}
	double div(double a,double b)
	{	
		double c;
		return c=a/b;
	}
}
class MainsClass
{
	public static void main(String args[])
	{
		ArithmaticOperation operation1=new ArithmaticOperation();
		operation1.add(5.0,7.0);
	}
}	
