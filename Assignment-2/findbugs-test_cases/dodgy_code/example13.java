/*I am trying to generate the following error:
Double assignment of local variable (SA_LOCAL_DOUBLE_ASSIGNMENT)
This method contains a double assignment of a local variable; e.g.

  public void foo() {
    int x,y;
    x = x = 17;
  }
*/
import java.io.*;
class Rectangle
{
	private int width; 
	private int height;
	Rectangle()
	{
		width=0;
		hegiht=0;
	}
	Rectangle(int width,int height)
	{
		this.width=width;
		this.height=height;
	}
	void rectangleInput()throws IOException
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter height");
		height=Integer.parseInt(z.readLine());
		System.out.print("Enter width:");
		width=Integer.parseInt(z.readLine());
	}
	void squareInput()throws IOException
	{
		int side;
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the side:");
		side=Integer.parseInt(z.readLine());
		height=width=side;
	}
	void findArea()
	{
		int area=width*height;
		System.out.print("The area is:"+area);
	}
}
class MainsClass
{
	public static void main(String args[])throws IOException
	{
		Rectangle rect1=new Rectangle();
		rect1.rectangleInput();
		rect1.findArea();
		Rectangle square1=new Rectangle();
		square1.squareInput();
		square1.findArea();
	}
}
