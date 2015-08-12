import java.io.*;
class Circle
{
	private double radius;
	private double PI=3.1415;
	Circle()
	{
		radius=0;
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	void input() throws IOException
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius:");
		radius=Double.parseDouble(z.readLine());
	}	
	void calculateArea()
	{
		double area=PI*radius*radius;
		System.out.println("The area of the circle="+area);
	}
	void calculatePerimeter()
	{
		double perimeter=2*PI*radius;
		System.out.println("The perimeter of the circle="+perimeter);
	}
}	
class MainsClass
{
	public static void main(String args[])throws IOException
	{
		Circle circle1=new Circle(12);
		circle1.calculateArea();
		circle1.calculatePerimeter();
	}
}
