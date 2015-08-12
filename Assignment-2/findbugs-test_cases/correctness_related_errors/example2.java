/*I am trying to generate the following type of error
 BIT: Incompatible bit masks (BIT_AND)
This method compares an expression of the form (e & C) to D, which will always compare unequal due to the specific values of constants C and D. This may indicate a logic error or typo.
this program will show this error.
The reason is (b== null) the method seems to return two value i.e. 0 and -1 although both not at the same time. It appears to your tool sonar code quality checking that the method is return two different values for the same comparision and hence one value may sometimes hide another value.*/
/*Finding examples to these kind of errors is super tought..and understand why the error is coming is super super tough. Some department teachers behave like that they know every fucking thing*/
import java.io.*;
class Coordinate
{
	//thougth it is not considered to be good practice to make the data members of a classs package private
	int x;
	int y;
	Coordinate()
	{
		x=0;
		y=0;
	}
	Coordinate(int x,int y)
	{
		this.x=0;
		this.y=0;
	}
	Coordinate(Coordinate a)
	{
		this.x=a.x;
		this.y=a.y;
	}
}
class CoordinateAssociateOperations
{
	int compareTo(Coordinate a,Coordinate b)
	{
		if(a==null)
		{
			return b==null ? 0 : 1;
		}
		if(b==null)
		{
			return -1;
		}
		return 1;
	}
	void calculateDistance(Coordinate a,Coordinate b)
	{
		double distance=(a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y);
		distance=Math.sqrt(distance);
		System.out.println("The distance between two coordinates"+distance);
	}
}
class MainsClass
{
	public static void main(String args[])
	{
		Coordinate a=new Coordinate(5,8);
		Coordinate b=new Coordinate(-5,1);
		CoordinateAssociateOperations operationOne=new CoordinateAssociateOperations();
		int eqFlag=operationOne.compareTo(a,b);
		if(eqFlag==0)
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are unequal");
		}
	}
}
