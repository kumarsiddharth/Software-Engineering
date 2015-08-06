import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
abstract class MyShape
{
	double areaValue;//this is package private: so, all the ssubclasses of the same package inherit it
	abstract double Area();//package private method and since it is part of an abstract class all subclass must overwrite the method Area
	abstract void input() throws IOException,Exception;
}
class MyRectangle extends MyShape
{
	private double width;
	private double height;
	MyRectangle() //again package private constructor
	{
		width=0;
		height=0;
	}
	MyRectangle(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	double Area()
	{
		 areaValue=width*height;
		 return areaValue;
	}
	void input() throws IOException, Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter width:");
		width=Double.parseDouble(z.readLine());	
		System.out.print("Enter height:");
		height=Double.parseDouble(z.readLine());
		//z.close(); we cannot close the stream here	
	}
}
class MyCircle extends MyShape
{
	private double radius;
	MyCircle()
	{
		radius=0;
	}
	MyCircle(double radius)
	{
		this.radius=radius;
	}
	void input() throws IOException, Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter radius:");
		radius=Double.parseDouble(z.readLine());	
		//z.close();we cannot close the strem here	
	}
	double Area()
	{
		areaValue=Math.PI*radius*radius;
		return areaValue;
	}
}
class MyTriangle extends MyShape
{
	private double side1,side2,side3;
	MyTriangle()
	{
		side1=side2=side3=0;
	}
	MyTriangle(double side1,double side2,double side3)
	{
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	void input() throws IOException, Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter side1:");
		side1=Double.parseDouble(z.readLine());	
		System.out.print("Enter side2:");
		side2=Double.parseDouble(z.readLine());	
		System.out.print("Enter side3:");
		side3=Double.parseDouble(z.readLine());			
		//z.close();we cannot close the stream here	
	}
	double Area()
	{
		double perimeter,s;
		perimeter=side1+side2+side3;
		s=perimeter/2;
		areaValue=s*(s-side1)*(s-side2)*(s-side3);
		areaValue=Math.sqrt(areaValue);
		return areaValue;
	}
}
class Mainsclass
{
	public static void main(String args[])throws IOException, Exception
	{
		int n;
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of MyShapes you want to create:");
		n=Integer.parseInt(z.readLine());
		MyShape []allMyShapes=new MyShape[n];
		double totalArea=0,currentArea;
		String MyShapeType;
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the MyShape you want to create:");
			MyShapeType=z.readLine();
			if(MyShapeType.compareTo("MyTriangle")==0)
			{
				allMyShapes[i]=new MyTriangle();//This is dynamic binding
				allMyShapes[i].input();
				currentArea=allMyShapes[i].Area();
				totalArea+=currentArea;
				System.out.println("The area of the created MyTriangle is:"+currentArea);
			}
			else if(MyShapeType.compareTo("MyRectangle")==0)
			{
				allMyShapes[i]=new MyRectangle();
				allMyShapes[i].input();
				currentArea=allMyShapes[i].Area();
				totalArea+=currentArea;
				System.out.println("The area of the created MyRectangle is:"+currentArea);
			}
			else if(MyShapeType.compareTo("MyCircle")==0)
			{
				allMyShapes[i]=new MyCircle();
				allMyShapes[i].input();
				currentArea=allMyShapes[i].Area();
				totalArea+=currentArea;
				System.out.println("The area of the created MyCircle is:"+currentArea);

			}	
			else
			{
				System.out.println("Invalid choice");
				i--;
				continue;
			}
			
		}
		System.out.println("Total area of the created MyShapes:"+totalArea);
		z.close();
	}
}
