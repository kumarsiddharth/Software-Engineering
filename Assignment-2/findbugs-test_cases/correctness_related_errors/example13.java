/*I am trying to generate the following type of error
null pointer dereferencing in java*/
import java.io.*;
class Complex
{
	private int real;
	private int imaginary;	
	private double modulus;
	private double argument;
	Complex()
	{
		real=0;
		imaginary=0;
	}
	Complex(int real,int imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	Complex(Complex c)
	{
		real=c.real;
		imaginary=c.imaginary;
	 }
	 void input()throws IOException
	 {
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the real part:");
		real=Integer.parseInt(z.readLine());
		System.out.print("Enter the imaginary part:");
		imaginary=Integer.parseInt(z.readLine());
	}
	 void modulusCalculate()
	 {
		modulus=Math.pow(real,2)+Math.pow(imaginary,2);
		modulus=Math.sqrt(modulus);
	 }
	 void argumentCalculate()
	 {
		argument=Math.atan2(imaginary,real);
	 }
	 Complex add(Complex b)
	 {
		Complex a=this;
		Complex c=new Complex();
		c.real=a.real+b.real;
		c.imaginary=a.imaginary+b.imaginary;
		return c;
	}
	Complex sub(Complex b)
	{
		Complex a=this;
		Complex c=new Complex();
		c.real=a.real-b.real;
		c.imaginary=a.imaginary-b.imaginary;
		return c;
	}
	Complex mult(Complex b)
	{
		Complex a=this;
		Complex c=new Complex();
		c.real=a.real*b.real-a.imaginary*b.imaginary;
		c.imaginary=a.imaginary*b.real+b.imaginary*a.real;
		return c;
	}
	void display()
	{
		if(real>=0&imaginary>=0)
		{
			System.out.println("The number is:"+real+"+"+imaginary+"i");
		}		
		else if(real>=0&&imaginary<0)
		{
			System.out.println("The number is:"+real+imaginary+"i");
		}
		else if(real<0&&imaginary>=0)
		{
			System.out.println("The number is:"+real+"+"+imaginary+"i");
		}
		else
		{
			System.out.println("The number is:"+real+imaginary+"i");
		}
		modulusCalculate();//obviously a non-static method can be called directly from another non static method
		argumentCalculate();//obviously a non-static method can be called directly from another non static method
		System.out.println("The modulus is:"+modulus);
		System.out.println("The arugment is:"+argument+" radian");		
	}
}
class MainsClass
{
	public static void main(String args[])throws IOException, Exception//it must throw IOException since it invokes one of the method which throws IOException
	{
		Complex number1=new Complex();
		number1.input();
		number1.display();
		Complex number2=null;
		number2.input();
		number2.display();
	}
}
