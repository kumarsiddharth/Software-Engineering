import java.io.*;
import java.lang.*;
class circle
{
	private double radius;	//	
	public void accept()throws IOException
	{
		
		System.out.print("Enter the radius:");
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		radius=Double.parseDouble(z.readLine());
	}
	public void calculate()
	{
		double circumference,area;
		area=Math.PI*radius*radius;
		circumference=2*Math.PI*radius;
		System.out.println("The area is:"+area);
		System.out.println("The circumference is:"+circumference);
		
	}
}
class Mainsclass
{
	public static void main(String args[])throws IOException
	{
		circle circ1=new circle();
		circ1.accept();
		circ1.calculate();
	}
}
